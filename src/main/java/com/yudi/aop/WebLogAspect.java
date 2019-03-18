package com.yudi.aop;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * create by  2018年1月31日-上午9:04:58
 *
 */
@Aspect
@Component
public class WebLogAspect {
	private ThreadLocal<Long> timeLocal = new ThreadLocal<>();
	private Logger logger = Logger.getLogger(getClass());
	
	@Pointcut("execution(public * com.yudi.*.controller.*.*(..))")
	public void webLog() {
	}

	@Before("webLog()")
	public void doBefore(JoinPoint joinPoint) throws Throwable {
		// 接收到请求，记录请求内容
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		
		String url = request.getRequestURL().toString();
		
		// 记录下请求内容
		logger.info("URL : " + url);
		logger.info("HTTP_METHOD : " + request.getMethod());
		logger.info("IP : " + request.getRemoteAddr());
		logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "."
				+ joinPoint.getSignature().getName());
		logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
		timeLocal.set(System.currentTimeMillis());
	}

	@AfterReturning(returning = "ret", pointcut = "webLog()")
	public void doAfterReturning(Object ret) throws Throwable {
		// 处理完请求，返回内容
		ObjectMapper objectMapper = new ObjectMapper();
		String responseJson = objectMapper.writeValueAsString(ret);
		long times;
		Long start = timeLocal.get();
		if (start != null) {
			JSONObject jsonObject = JSONObject.parseObject(responseJson);
			ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
			HttpServletRequest request = attributes.getRequest();
			String url = request.getRequestURL().toString();
			times = System.currentTimeMillis() - start;
			jsonObject.put("times", times + "ms");
			jsonObject.put("url", url);
			responseJson = jsonObject.toJSONString();
		}
		logger.info("RESPONSE : " + responseJson);
	}

}

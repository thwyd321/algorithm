package com.yudi.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

/**
 * create by yangrq 2018年2月27日-上午10:11:20
 *
 */
//@Component
public class HttpWrapperFilter extends GenericFilterBean {

//	@Override
//	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//			throws ServletException, IOException {
//		System.out.println("into filter .......");
//		ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper(request);
//		ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(response);
//		// HttpUtil.readPostJsonData(requestWrapper);这是一个读取requestBody的工具类方法
//		filterChain.doFilter(requestWrapper, responseWrapper);
//		// HttpUtil.readPostJsonData(requestWrapper);这是一个读取requestBody的工具类方法
//	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		
		ContentCachingRequestWrapper requestWrapper = new ContentCachingRequestWrapper(httpRequest);
		ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(httpResponse);
		// HttpUtil.readPostJsonData(requestWrapper);这是一个读取requestBody的工具类方法
		chain.doFilter(requestWrapper, responseWrapper);
		// HttpUtil.readPostJsonData(requestWrapper);这是一个读取requestBody的工具类方法
		
		String requestBody = new String(requestWrapper.getContentAsByteArray());
        String responseBody = new String(responseWrapper.getContentAsByteArray());
        
        System.out.println("requestBody:" + requestBody);
        // Do not forget this line after reading response content or actual response will be empty!
        responseWrapper.copyBodyToResponse();
		
	}
}

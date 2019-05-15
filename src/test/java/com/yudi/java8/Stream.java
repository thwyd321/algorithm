package com.yudi.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description :
 * @params $params$
 * @Return : $return$
 * @Author : $user$
 * @Date : $date$ $time$
 */
public class Stream {
    public static void main(String[] args) {


    }

    /**
     * 过滤，求和
     */
    @Test
    public  void  test1(){
        List<Task> tasks = Arrays.asList(new Task(Status.OPEN, 10), new Task(Status.OPEN, 10), new Task(Status.CLOSED, 10));
        int sum = tasks.stream().filter(task -> task.getStatus() == Status.OPEN).mapToInt(Task::getPoints).sum();
        System.out.println(sum);
    }

    /**
     * 使用parallel 并行处理求和
     */
    @Test
    public  void  test2(){
        List<Task> tasks = Arrays.asList(new Task(Status.OPEN, 10), new Task(Status.OPEN, 10), new Task(Status.CLOSED, 10));
        Integer reduce = tasks.stream().parallel().filter(task -> task.getStatus() == Status.OPEN).map(task -> task.getPoints()).reduce(0, Integer::sum);
        System.out.println(reduce);
    }

    /**
     * 集合分组
     */
    @Test
    public  void  test3(){
        List<Task> tasks = Arrays.asList(new Task(Status.OPEN, 10), new Task(Status.OPEN, 10), new Task(Status.CLOSED, 10));
        Map<Status, List<Task>> collect = tasks.stream().collect(Collectors.groupingBy(Task::getStatus));
        System.out.println(collect.get(Status.OPEN));
        System.out.println(collect.get(Status.CLOSED));
    }
    /**
     * 如何计算集合中每个任务的点数在集合中所占的比重，具体处理的代码如下：
     */
    @Test
    public  void  test4() {
        List<Task> tasks = Arrays.asList(new Task(Status.OPEN, 10), new Task(Status.OPEN, 10), new Task(Status.CLOSED, 10));
        final double totalPoints = tasks
                .stream()
                .parallel()
                .map( task -> task.getPoints() ) // or map( Task::getPoints )
                .reduce( 0, Integer::sum );


        final Collection< String > result = tasks.stream()                                        // Stream< String >
             .mapToInt( Task::getPoints )                     // IntStream
             .asLongStream()                                  // LongStream
             .mapToDouble( points -> points / totalPoints )   // DoubleStream
             .boxed()                                         // Stream< Double >
             .mapToLong( weigth -> ( long )( weigth * 100 ) ) // LongStream
             .mapToObj( percentage -> percentage + "%" )      // Stream< String>
             .collect( Collectors.toList() );                 // List< String >

        System.out.println( result );
    }

    private enum Status{
        OPEN,CLOSED
    };
    private static final class Task{

        private Status status;
        private Integer points;

        public Task(Status status, Integer points) {
            this.status = status;
            this.points = points;
        }

        public Status getStatus() {
            return status;
        }

        public void setStatus(Status status) {
            this.status = status;
        }

        public Integer getPoints() {
            return points;
        }

        public void setPoints(Integer points) {
            this.points = points;
        }

        @Override
        public String toString() {
            return "Task{" +
                    "status=" + status +
                    ", points=" + points +
                    '}';
        }
    }
}

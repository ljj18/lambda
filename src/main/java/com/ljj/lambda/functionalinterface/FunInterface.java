/**
 * 文件名称:          		FunInterface.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.lambda.functionalinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * lambda表达式：函数式接口说明
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-21 11:19
 * 
 */
public class FunInterface {
    private ExecutorService fixedExecutorService = new ThreadPoolExecutor(2, 50, 0L, TimeUnit.MILLISECONDS,
        new LinkedBlockingQueue<Runnable>());

    /**
     * Runnable函数式接口
     */
    public void runnableImpl() {
        // 实例化变量
        Runnable r = () -> System.out.println("Runnable (单行代码), 实例化变量");
        fixedExecutorService.execute(r);
        // 实例化变量
        Runnable rr = () -> {
            int a = 3;
            int b = 4;
            System.out.println("Runnable, 实例化变量(代码块), a = " + a + ", b = " + b + ", a + b = " + (a + b));
        };
        fixedExecutorService.execute(rr);
        // 单行代码
        fixedExecutorService.execute(() -> System.out.println("Runnable, 代码(单行代码)"));
        // 代码块
        fixedExecutorService.execute(() -> {
            int a = 30;
            int b = -40;
            System.out.println("Runnable, 代码(单行块), a = " + a + ", b = " + b + ", a + b = " + (a + b));
        });
    }

    /**
     * Comparator函数式接口
     */
    public void comparatorImpl() {
        // 字符串
        List<String> strs = Arrays.asList("a", "b", "d");
        Collections.sort(strs, (s1, s2) -> {
            return s1.compareTo(s2);
        });
        System.out.println("Comparator 字符串升序排序：" + strs);
        Collections.sort(strs, (s1, s2) -> {
            return s2.compareTo(s1);
        });
        System.out.println("Ccomparator字符串降序排序：" + strs);

        // 数值
        List<Integer> nums = Arrays.asList(1, 2, 4, 8, 16);
        Collections.sort(nums, (s1, s2) -> {
            return s1 - s2;
        });
        System.out.println("Comparator 数值 升序排序：" + nums);
        Collections.sort(nums, (s1, s2) -> {
            return s2 - s1;
        });
        System.out.println("Comparator 数值  降序排序：" + nums);
    }

    /**
     * Consumer函数式接口
     */
    public void consumerImpl() {
        // 有参数无返回值
        Consumer<Integer> consumer = (x) -> System.out.println("Consumer, 有参数据无返回值:" + x);
        consumer.accept(5);
    }

    /**
     * Function函数式接口
     */
    public void functionImpl() {
        // 有多个数有返回值
        Function<Integer, String> f = (i) -> i + "d";
        System.out.println("Function : " + f.apply(1000));
    }

    /**
     * BiFunction函数式接口
     */
    public void biFunctionImpl() {
        // 括号指定参数类理
        BiFunction<Integer, Integer, String> bf = (Integer a, Integer b) -> {
            return String.valueOf(a) + String.valueOf(b) + "";
        };
        System.out.println("BiFunction : " + bf.apply(1000, 200));
    }

}

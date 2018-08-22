/**
 * 文件名称:          		ListMap.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.lambda.map;

import java.util.Arrays;
import java.util.List;

/**
 * TODO: 文件注释
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-21 18:17
 * 
 */
public class ListMap {

    /**
     * 每个元素增加固定值, Lambda表达式
     */
    public void costMap() {
        List<Integer> costBefore = Arrays.asList(100, 200, 300, 400, 500);
        System.out.println("每个元素增加固定值, Lambda表达式：");
        costBefore.stream().map((cost) -> cost + .12 * cost).forEach(System.out::println);
    }
    
    /**
     * 每个元素增加固定值, Lambda表达式
     */
    public void costReduce() {
        List<Integer> costBefore = Arrays.asList(100, 200, 300, 400, 500);
        System.out.println("所有元素求和, Lambda表达式：");
        double bill = costBefore.stream().map((cost) -> cost + .12 * cost).reduce((sum, cost) -> sum + cost).get();
        System.out.println(bill);
    }
}

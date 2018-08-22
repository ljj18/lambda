/**
 * 文件名称:          		StreamFilter.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.lambda.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TODO: 文件注释
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-21 18:38
 * 
 */
public class StreamFilter {

    /**
     * 过滤list的元素
     */
    public void listStreamFilter() {
        List<String> target = Arrays.asList("ab", "cdse", "a", "defeadsf", "aegwis", "bad");
        List<String> filtered = target.stream().filter(x -> x.length() > 3).collect(Collectors.toList());
        System.out.printf("原 List : %s, 过滤后 list : %s %n", target, filtered);
    }

    /**
     * 去重
     */
    public void listStreamDistinct() {
        List<Integer> nums = Arrays.asList(9, 10, 3, 4, 7, 3, 4, 13, 25, 10, 8, 31, 9);
        List<Integer> distinct = nums.stream().distinct().collect(Collectors.toList());
        System.out.printf("原 List : %s,  去重后的List :%s %n", nums, distinct);
    }

    /**
     * 最大值,最小值 ,汇总,平均值
     */
    public void listStreamIntSummaryStatistics() {
        List<Integer> primes = Arrays.asList(9, 10, 3, 4, 7, 3, 4, 13, 25, 10, 8, 31, 9);
        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("最大值 : " + stats.getMax());
        System.out.println("最小值 : " + stats.getMin());
        System.out.println("总和 : " + stats.getSum());
        System.out.println("平均 : " + stats.getAverage());
    }
}

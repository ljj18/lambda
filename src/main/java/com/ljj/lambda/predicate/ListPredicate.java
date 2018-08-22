/**
 * 文件名称:          		ListPredicate.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.lambda.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * TODO: 文件注释
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-21 15:49
 * 
 */
public class ListPredicate {

    /**
     * 遍历List
     */
    public void listEach() {
        System.out.println("遍历 List：");
        List<String> list = Arrays.asList("Java", "C++", "PHP", "Python", "C#", "Android", "Objective++", "Scala");
        list.forEach(x -> System.out.print(x + " "));
    }

    /**
     * 过滤List
     */
    public void listFilter() {
        List<String> list = Arrays.asList("Java", "C++", "PHP", "Python", "C#", "Android", "Objective++", "Scala");
        // 包括 a 的语句
        System.out.println("包括 a");
        filter(list, (str) -> str.contains("a"));
        // 全部过虑
        System.out.println("全部过虑");
        filter(list, (str) -> false);
        System.out.println("全部留下");
        filter(list, (str) -> true);
    }

    /**
     * 
     * 
     */
    public void complexPredicate() {
        List<String> list = Arrays.asList("Java", "C++", "PHP", "Python", "C#", "Android", "Objective++", "Scala");
        Predicate<String> containsA = (str) -> str.contains("a");
        Predicate<String> len4 = (str) -> str.length() == 4;
        
        list.stream().filter(containsA.and(len4))
            .forEach((n) -> System.out.println("\nName, which starts with'J' and four letter long is : " + n));
        
    }

    private void filter(List<String> list, Predicate<String> condition) {
        list.forEach(str -> {
            if (condition.test(str)) {
                System.out.print(str + " ");
            }
        });
        System.out.println();
    }
}

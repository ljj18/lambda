/**
 * 文件名称:          		MethodReference.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.lambda.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * 方法引用
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-22 10:48
 * 
 */
public class MethodReference {

    /**
     * 静态方法引用
     */
    public void staticMethodReference() {
        System.out.println("静态方法引用-------------");
        List<User> list = new ArrayList<User>();
        list.add(new User("ljj", 1, 39));
        list.add(new User("wnl",2, 29));
        list.add(new User("zlb",2, 27));
        System.out.println("User 按年龄排序：");
        SortKit.userSort(UserKit::sortByAge, list);
        System.out.println(list);
        System.out.println("User 按姓名排序：");
        SortKit.userSort(UserKit::sortByName, list);
        System.out.println(list);
    }
    
    /**
     * 实例对象引用
     */
    public void instanceMethodReference() {
        System.out.println("实例对象引用-------------");
        List<User> list = new ArrayList<User>();
        UserConstructor uc = User::new;
        list.add(uc.func("ljj", 1, 39));
        list.add(uc.func("wnl",2, 29));
        list.add(uc.func("zlb",2, 27));
        UserKit kit = new UserKit();
        System.out.print("输出 User 年龄：");
        list.forEach((n)->System.out.print(printUserAge(kit::getUserAge, n) + ", "));
        System.out.println();
    }
    
    /**
     * 对像任意方法引用
     */
    public void anyMethodReference() {
        System.out.println("对像任意方法引用-------------");
        String[] strs = new String[] {"sdf", "bdse", "ese", "c++", "java"};
        System.out.print("字符串排序：");
        Arrays.sort(strs, String::compareToIgnoreCase);
        Arrays.asList(strs).stream().forEach(s -> System.out.print(s + ", "));
        System.out.println("");
    }
    
    /**
     *  构造器引用
     */
    public void constructorReference() {
        System.out.println("构造器引用-------------");
        UserConstructor uc = User::new;
        System.out.println(uc.func("梁金晶", 1, 37));
    }
    
    private int printUserAge(Function<User, Integer> f, User u) {
        return f.apply(u);
    }
    
}

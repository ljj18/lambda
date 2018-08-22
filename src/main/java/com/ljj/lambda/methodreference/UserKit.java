/**
 * 文件名称:          		UserKit.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.lambda.methodreference;

import java.util.List;

/**
 * TODO: 文件注释
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-22 11:57
 * 
 */
public class UserKit {
    
    /**
     * 
     * @param list
     */
    public static List<User> sortByAge(List<User> list) {
        /*
         * 静态方法引用
         */
        list.sort(UserKit::userCompareByAge);
        return list;
    }

    /**
     * 
     * @param a
     * @param b
     * @return
     */
    public static int userCompareByAge(User a, User b) {
        return a.getAge() - b.getAge();
    }

    
    /**
     * 
     * @param list
     */
    public static List<User> sortByName(List<User> list) {
        /*
         * 静态方法引用
         */
        list.sort((User a, User b) -> a.getName().compareTo(b.getName()));
        return list;
    }
    
    /**
     * 
     */
    public int getUserAge(User user) {
        return user.getAge();
    }
}

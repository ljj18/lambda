/**
 * 文件名称:          		UserConstructor.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.lambda.methodreference;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-22 16:02
 * 
 */
@FunctionalInterface
public interface UserConstructor {
    
    /**
     * 
     * @param name
     * @param sex
     * @param age
     * @return
     */
    User func(String name, int sex, int age);
}

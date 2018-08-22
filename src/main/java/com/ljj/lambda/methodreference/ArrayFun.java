/**
 * 文件名称:          		ArrayFun.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.lambda.methodreference;

/**
 * 数组接口式函数
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-22 11:40
 * 
 */
@FunctionalInterface
public interface ArrayFun<T> {
    
    /**
     * 
     * @param t
     * @return T
     */
    T doAction(T t);
}

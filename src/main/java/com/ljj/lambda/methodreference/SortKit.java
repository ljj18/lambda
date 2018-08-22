/**
 * 文件名称:          		SortKit.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.lambda.methodreference;

import java.util.List;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-22 14:47
 * 
 */
public class SortKit {

    /**
     * 
     * @param sf
     * @param list
     * @return
     */
    public static List<User> userSort(ArrayFun<List<User>> af, List<User> list) {
        return af.doAction(list);
    }
}

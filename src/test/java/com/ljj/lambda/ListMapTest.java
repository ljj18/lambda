/**
 * 文件名称:          		ListMapTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.lambda;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ljj.lambda.map.ListMap;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-21 18:35
 * 
 */
public class ListMapTest {

    @ Before
    public void setUp() throws Exception {
    }

    @ After
    public void tearDown() throws Exception {
    }

    @ Test
    public void testListMap() {
        ListMap lm = new ListMap();
        lm.costMap();
    }
    
    @ Test
    public void testCostReduce() {
        ListMap lm = new ListMap();
        lm.costReduce();
    }

}

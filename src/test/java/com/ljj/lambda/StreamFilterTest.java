/**
 * 文件名称:          		StreamFilterTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.lambda;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ljj.lambda.stream.StreamFilter;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-21 18:51
 * 
 */
public class StreamFilterTest {

    @ Before
    public void setUp() throws Exception {
    }

    @ After
    public void tearDown() throws Exception {
    }

    @ Test
    public void testFilter() {
        StreamFilter sf = new StreamFilter();
        sf.listStreamFilter();
    }
    
    @ Test
    public void testDistinct() {
        StreamFilter sf = new StreamFilter();
        sf.listStreamDistinct();
    }
    
    @ Test
    public void testIntSummaryStatistics() {
        StreamFilter sf = new StreamFilter();
        sf.listStreamIntSummaryStatistics();
    }

}

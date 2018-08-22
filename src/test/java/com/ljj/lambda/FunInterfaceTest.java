/**
 * 文件名称:          		FunInterfaceTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.lambda;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ljj.lambda.functionalinterface.FunInterface;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-21 15:02
 * 
 */
public class FunInterfaceTest {

    @ Before
    public void setUp() throws Exception {
    }

    @ After
    public void tearDown() throws Exception {
    }

    @ Test
    public void testRunnable() {
        FunInterface fi = new FunInterface();
        fi.runnableImpl();
    }
    
    @ Test
    public void testComparator() {
        FunInterface fi = new FunInterface();
        fi.comparatorImpl();
    }
    
    @ Test
    public void testConsumer() {
        FunInterface fi = new FunInterface();
        fi.consumerImpl();
    }
    
    @ Test
    public void testFunction() {
        FunInterface fi = new FunInterface();
        fi.functionImpl();
    }
    
    
    @ Test
    public void testBiFunction() {
        FunInterface fi = new FunInterface();
        fi.biFunctionImpl();;
    }
    

}

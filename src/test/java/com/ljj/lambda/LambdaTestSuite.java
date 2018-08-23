/**
 * 文件名称:          		LambdaTestSuite.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.lambda;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-23 15:50
 * 
 */
@ RunWith(Suite.class)
@ SuiteClasses({FunInterfaceTest.class, ListMapTest.class, ListPredicateTest.class, MethodReferenceTest.class,
    StreamFilterTest.class})
public class LambdaTestSuite {

}

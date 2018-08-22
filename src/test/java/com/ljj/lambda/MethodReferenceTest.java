/**
 * 文件名称:          		MethodReferenceTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.lambda;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ljj.lambda.methodreference.MethodReference;

/**
 * TODO: 文件注释
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-08-22 15:01
 * 
 */
public class MethodReferenceTest {

    @ Before
    public void setUp() throws Exception {
    }

    @ After
    public void tearDown() throws Exception {
    }

    @ Test
    public void testStaticMethodReference() {
        MethodReference mf = new MethodReference();
        mf.staticMethodReference();
    }

    @ Test
    public void testInstanceMethodReference() {
        MethodReference mf = new MethodReference();
        mf.instanceMethodReference();
    }

    @ Test
    public void testConstructorReference() {
        MethodReference mf = new MethodReference();
        mf.constructorReference();
    }

    @ Test
    public void anyMethodReference() {
        MethodReference mf = new MethodReference();
        mf.anyMethodReference();
    }
}

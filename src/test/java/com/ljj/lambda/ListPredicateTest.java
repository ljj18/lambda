/**
 * 文件名称:          		ListPredicateTest.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.lambda;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ljj.lambda.predicate.ListPredicate;

/**
 * TODO: 文件注释
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-08-21 17:52
 * 
 */
public class ListPredicateTest {

    @ Before
    public void setUp() throws Exception {
    }

    @ After
    public void tearDown() throws Exception {
    }

    @ Test
    public void testListEach() {
        ListPredicate lp = new ListPredicate();
        lp.listEach();
    }

    
    @ Test
    public void testListPredicate() {
        ListPredicate lp = new ListPredicate();
        lp.listFilter();
    }
    
    
    @ Test
    public void testComplexPredicate() {
        ListPredicate lp = new ListPredicate();
        lp.complexPredicate();
    }
}

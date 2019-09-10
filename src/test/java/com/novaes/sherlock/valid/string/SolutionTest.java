/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novaes.sherlock.valid.string;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kbos
 */
public class SolutionTest {
    
    @Test
    public void test1() {
        assertSame(Solution.isValid("aabbcd"), "NO");
    }
    
    @Test
    public void test2() {
        assertSame(Solution.isValid("aabbccddeefghi"), "NO");
    }
    
    @Test
    public void test3() {
        assertSame(Solution.isValid("abcdefghhgfedecba"), "YES");
    }
    
     @Test
    public void test4() {
        assertSame(Solution.isValid("abc"), "YES");
    }
    
    @Test
    public void test5() {
        assertSame(Solution.isValid("aabbcc"), "YES");
    }
    
    @Test
    public void test6() {
        assertSame(Solution.isValid("aaaaabc"), "NO");
    }
    
    @Test
    public void test7() {
        assertSame(Solution.isValid("aaaabbcc"), "NO");
    }
    
    
    
}

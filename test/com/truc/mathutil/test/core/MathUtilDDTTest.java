package com.truc.mathutil.test.core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.truc.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author DELL
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

   //trả về mảng 2 chiều gồm nhiều cặp ExpectedInput
   @Parameterized.Parameters //JUnit sẽ ngầm chạy loop qua từng dòng của
   // mảng để lấy ra dc cặp data i/ex
   public static Object[][] initData() {
      return new Integer[][]{
         {0, 1},
         {1, 1},
         {2, 2},
         {3, 6},
         {4, 24},
         {6, 720},};

   }
   @Parameterized.Parameter(value = 0) //map với mảng data
   public int n; //biến map với value của cột 0 của mảng

   @Parameterized.Parameter(value = 1)
   public long expected;

   @Test
   public void testGetFactorialGivenRightArgumentReturnsWell() {
      Assert.assertEquals(expected, MathUtil.getFactorial(n));
   }
}

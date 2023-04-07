/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truc.mathutil.test.core;

import com.truc.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class MathUtilityTest {

   @Test
   public void testGetFactorialGivenRightArgumentReturnsWell() {
      int n = 0;
      long expected = 1;
      //long actual=;  gọi hàm cần test bên core/app code chính
      long actual = MathUtil.getFactorial(n);

      //so sánh expected vs actual dùng framework
      assertEquals(expected, actual); // hàm so sánh 2 giá trị có giống nhau không
      //nếu giống -> màu xanh
      //nếu không giống -> màu đỏ

      //gộp thêm vài case thành công
      assertEquals(1, MathUtil.getFactorial(1)); // hàm so sánh 2 giá trị có giống nhau không
      assertEquals(2, MathUtil.getFactorial(2)); // hàm so sánh 2 giá trị có giống nhau không
      assertEquals(6, MathUtil.getFactorial(3)); // hàm so sánh 3! == 6
      assertEquals(24, MathUtil.getFactorial(4)); // hàm so sánh 2 giá trị có giống nhau không
      assertEquals(120, MathUtil.getFactorial(5)); // hàm so sánh 2 giá trị có giống nhau không
      assertEquals(720, MathUtil.getFactorial(5)); // hàm so sánh 2 giá trị có giống nhau không

   }

   //Test case:
   //input: -5
   //expected: IllegalArgumentException xuất hiện
   /*
   @Test(expected = NumberFormatException.class)
   public void testGetFactorialGivenWrongArgumentThrowsException() {
      MathUtil.getFactorial(-5);
      
   } */
   @Test(expected = IllegalArgumentException.class)
   public void testGetFactorialGivenWrongArgumentThrowsException() {
      MathUtil.getFactorial(-5);
   }

   //Cách khác bắt ngoại lệ xuất hiện
   //sd Lambda
   //Test case : hàm sẽ ném về ngoại lệ nếu nhận vào 21 -> xanh
   @Test
   public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
//      Assert.assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));

//      MathUtil.getFactorial(-5);
   }

   @Test
   public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
      //chủ động kiểm soát ngoại lệ
      try {
         MathUtil.getFactorial(-5);
      } catch (Exception e) {
         Assert.assertEquals("Invalid argument, n must be between 0 and 20", 
                                    e.getMessage());
      }
   }
}

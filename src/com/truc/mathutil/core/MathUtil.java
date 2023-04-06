/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truc.mathutil.core;

/**
 *
 * @author DELL
 */
public class MathUtil {
   //hàm tính giai thừa
   //n! = 1.2.3.4...n
   //k có giai thừa cho số âm
   //0!=1!=1
   //20! 18 con số 0, vừa đủ cho kiểu long
   // tính n! trong khoảng từ 0..20
   public static long getFactorial(int n) {
      if(n<0 || n>20) {
         throw new IllegalArgumentException("Invalid argument, n must be between 0 and 20");
      }
      if(n==0 || n==1) {
         return 1;
      }
      long product = 1;
      for (int i = 2; i <= n; i++) {
         product *= i;
      }
      return product;
   }
}

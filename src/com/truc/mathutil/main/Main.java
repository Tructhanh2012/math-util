/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truc.mathutil.main;

import com.truc.mathutil.core.MathUtil;

/**
 *
 * @author DELL
 */
public class Main {
   public static void main(String[] args) {
      // -5 0 20 21
      long expected = 120; //-> 5
      int n =5;
      long actual = MathUtil.getFactorial(n);
      System.out.println("5! = " + expected + " expected");
      System.out.println("5! = " + actual + " actual");
   }
}

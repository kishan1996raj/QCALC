 package com.crio.qcalc;
public class ScientificCalculator {

    public double squareOf(double num) {
        return num * num;
    }

    public static  double cubeOf(double num) {
        return num * num * num;
    }
     public  double powerOf(double base, double exponent) {
         return Math.pow(base, exponent);
     }

     public  double squareRoot(double num) {
         return Math.sqrt(num);
     }

     public  int modulo(int dividend, int divisor) {
         return dividend % divisor;
     }
  

     public static  int  divide(double dividend, double divisor) {
         return (int)(dividend / divisor);
     }
}

package edu.training.primitives.doublefloat;

public class Solution {
    public static void main(String...args) {
        float f1 = 1.0F, f2;
        double d1, d2 = Double.NaN;
        
        int i = 2, j = 3;
        f1= (float)i/j; //0.6666667
        f2= i/j; //= 0
        //d1= (float)i/j; //= 0.6666666865348816
        //d1= i/(double)j; //= 0.6666666666666666
        d1= (float)i/(double)j; //= 0.6666666666666666
        
        System.out.println(i  + " + " + j + " = " + f1);
        System.out.println(i  + " + " + j + " = " + f2);
        System.out.println(i  + " + " + j + " = " + d1);
        
        d2 =d2 + 1;
        System.out.println("d2 = " +d2 + " " + (d2==d2));
        d2 = 0/0.0;
        System.out.println("d2 = " +d2 + " " + (d2==d2));
        
        
    }
}

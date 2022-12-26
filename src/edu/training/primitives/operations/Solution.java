package edu.training.primitives.operations;

public class Solution {
    public static void main(String... args) {
        byte z, k, j = z = k = 118;
//        for (int i = 0; i < 7; i++) {
//            int t = 1;
//            j >>= t; k >>>= t; z <<= t;
//            System.out.print("j = " + j + ";");
//            System.out.print("k = " + k + ";");
//            System.out.println("z = " + z);
//        }
        
        k = 4;
        System.out.println("k = " + ~k);
        int a = 0b1010, b = 0b1100;
        int c = a|b, d = c << 1, e = c >> 1;
        
        System.out.println(Integer.toBinaryString(a) + "|" + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c));
        System.out.println(a +"|" + b + " = " + c);
        System.out.println("c << 1= " + Integer.toBinaryString(d));
        System.out.println("c << 1= " + d);
        System.out.println("c >> 1= " + Integer.toBinaryString(e));
        System.out.println("c >> 1= " + e);
        
    }
}

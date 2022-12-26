package edu.training.primitives.ints;

public class Solution {
    public  static void main(String... bubu) {
        /*for (int i = 42; i < 58; i++) {
            System.out.println("'" + (char)i + "' ("+ Character.getName(i) + ") is " + i);
        }*/
        
        //int a = 1114110;
        int a = 1139;
        int base = 10;
        int m = 2;
        int val = 1;
        for (int i = 1; i<= m; i++){
            val *= base;
        }
        int b = a - (a/val)*val;
        System.out.println("a="+a);
        System.out.println("b="+b);
        
        int num =/*comment*/ '\u0045';
        System.out.println("\\u0045 = " + (char)num + '\b'+" " + num + " ");
        /*for (int i = (a); i < (b); i++) {
//            System.out.println("'" + (char)i + "' ("+ Character.getName(i) + ") is " + i);
            System.out.println("'" + (char)i + "' () is " + i);
        }*/
    }
}

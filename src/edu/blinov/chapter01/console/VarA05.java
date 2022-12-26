package edu.blinov.chapter01.console;

public class VarA05 {
    public static void main(String... arr) {
        int sum = 0;
        for (String a: arr) {
            try {
                sum +=Integer.parseInt(a);
            } catch(NumberFormatException e) {
            }
        }
        System.out.println("sum = " + sum + " ");
    }
}

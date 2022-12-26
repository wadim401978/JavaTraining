/*
 Fibonacci numbers
 */
package edu.blinov.chapter01.console;


public class VarB12 {
    //String java = "7"; - нет ошибки
    public static void main(String... args) {
        System.out.println("Variant 12. Blinov. Числа Фибоначчи. page27");
        System.out.print("Input n: ");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        if (n<3) n=3;
        int[] arr = new int[n];
        arr[0]=0;
        for (int i = 1; i < n; i++) {
            arr[i] = ((i > 1) ? arr[i - 1] : 1) + ((i > 1) ? arr[i - 2] : 0);
        }
        for (int i = 0; i<n; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        
        
    }
    
}

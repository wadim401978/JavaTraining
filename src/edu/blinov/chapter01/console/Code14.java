package edu.blinov.chapter01.console;

public class Code14 {
    public static void main(String... args) {
        System.out.print("Enter Your name:");
        try (java.util.Scanner scan = new java.util.Scanner(System.in)) {
            String name = scan.nextLine();
            System.out.println("Hello, " + name);
        } catch(Exception e) {
            
        }
    }
}

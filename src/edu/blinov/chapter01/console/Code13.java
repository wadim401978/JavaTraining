package edu.blinov.chapter01.console;

//import java.io.IOException;

public class Code13 {
    public static void main(String... args) {
        int x;
        try {
            
            x = System.in.read();
            System.out.println("'" + (char)x + "' is " + x);
            
        } catch(java.io.IOException e) {
            System.err.print("ERROR: " + e);
        }
        
        

        
    }
    
}

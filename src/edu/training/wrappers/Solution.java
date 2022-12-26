package edu.training.wrappers;

/**
 *
 * @author vadimsorokin
 */
public class Solution {
    
    public static Integer IntegerField;
    public static int intField;
    
    public static void doIntegers() {
        intField = 2;
        System.err.println("int1 = " + intField);
        
        IntegerField = intField;
        //System.out.println("Integer = " + ++IntegerField); //так можно,но результат другой
        //System.out.println("Integer = " +++IntegerField); //так нельзя
        System.out.println("Integer = " + IntegerField++);
        
        intField = IntegerField.intValue(); //необязательный unboxing 
        //intField = IntegerField; - можно и так! Так, даже корректнее
        
        System.err.println("int2 = " + intField);
        IntegerField = Integer.valueOf(intField++); //необязательный боксинг
        System.out.println("Integer = " + IntegerField);
        
        String textInt = IntegerField.toString();
        System.out.println("three1 = " + textInt);
        
        textInt = Integer.toString(intField);
        System.out.println("three2 = " + textInt);
        //System.out.println("is(Integer==int): "+ (intField-- == IntegerField));//false
        System.out.println("is(Integer==int):(" + intField + ") "+ (--intField == IntegerField));//true
        
        IntegerField = intField = 200;
        System.out.println("is(Integer==int):(" + intField + ") "+ (intField == IntegerField));//true
        
        IntegerField = 100;
        Integer newInt = 100;
        System.out.println("is(IntegerField==newInt):(" + IntegerField + ") "+ (newInt == IntegerField));//true->because of a cache
        newInt = new Integer(100);
        System.out.println("is(IntegerField==newInt):(" + IntegerField + ") "+ (newInt == IntegerField));//false->because of a different link
        
        System.out.println("Hex:(" + IntegerField + ") " + Integer.toHexString(IntegerField));
        System.out.println("Oct:(" + IntegerField + ") " + Integer.toOctalString(IntegerField));
        System.out.println("Bin:(" + IntegerField + ") " + Integer.toBinaryString(IntegerField));
        
        String numString = "100";
        int num = Integer.parseInt(numString, Character.MIN_RADIX+6); 
        System.out.println("Parse+1=" + ++num + "  Character.MIN_RADIX=" + Character.MIN_RADIX);
        System.out.println("Max int + 1 million = " + (((long)Integer.MAX_VALUE)+1000000000));
        
    }
    
    public static void doChar() {
        char letter01 = 'a';
        
        System.out.println("letter 01 - " + ++letter01);//letter 'b'
        
        Character wrapLetter01 = letter01;
        int code = 100;
        System.out.println("code = " + code + ": " + Character.getName(code));
        System.out.println("code = " + code + ": " + Character.toString((char)code));
        System.out.println("code of '" + letter01 + "' is " + Character.getNumericValue(letter01));
        System.out.println("isLetter (" + letter01 + ") = " + Character.isLetter(letter01));
        System.out.println("isAlphabetic (" + letter01 + ") = " + Character.isAlphabetic(letter01));
        System.out.println("isDigit (" + letter01 + ") = " + Character.isDigit(letter01));
        System.out.println("code of '" + (char)code + "' is " + Character.getNumericValue(code)); //??
        
        letter01 = '3'; //letter01 = 3; not the same
        System.out.println("isDigit (" + letter01 + ") = " + Character.isDigit(letter01));
        letter01 = ' '; 
        System.out.println("code = " + letter01 + ": " + Character.getName(letter01));
        System.out.println("isSpaceChar (" + letter01 + ") = " + Character.isSpaceChar(letter01));
    }
    
    public static void doDouble(String... args) {
        double a = 1.0, b = 0, c;
        c = -1/b;
        System.out.println("a/b = " + (a/b));
        System.out.println("c==-infinity: " + (c==Double.NEGATIVE_INFINITY));
        a=0; b=0; c=a/b;
        System.out.println("0/0 = " + c);
    }
    
    public static void doString() {
        String string = "One is 1, two is 2.";
        int countDigits = 0, countLetters = 0, countSpaces = 0;
        for (int i = 0; i < string.length(); i++) {
            //System.out.println("isLetter" + i + " = " + line.codePointAt(i));
            if (Character.isDigit(string.codePointAt(i))) countDigits++;
            if (Character.isLetter(string.codePointAt(i))) countLetters++;
            if (Character.isSpaceChar(string.codePointAt(i))) countSpaces++;
        }
        System.out.println("digits = " + countDigits);
        System.out.println("letters = " + countLetters);
        System.out.println("spaces = " + countSpaces);
    }
    
    public static void main(String... args) {
        System.out.println("Hello, wrappers!");
        //doIntegers();
        //doChar();
        //doDouble();
        doString();
    }
}

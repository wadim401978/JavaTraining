package edu.training.statics;

//import com.training.statics.Classes.Inner;

public class Solution {
    public static void main(String... args) {
        System.out.println("This is static classes solutions!");
        
        Classes.Outer.info();
        Classes.Outer outer = new Classes.Outer();
        outer.setName("Vadim");
        System.out.println("Hello, " + outer.getName());
        
        Classes.Inner id01 = new Classes().new Inner();
        id01.info();
        id01.setId(33);
        System.out.println("You set id1=" + id01.getId());
        
        Classes idClass = new Classes();
        
        /*without declared import Classes.Inner*/
        Classes.Inner id02 = idClass.new Inner();
        
        /*with declared import Classes.Inner*/
        //Inner id02 = idClass.new Inner(); 
        
        id02.setId(44);
        System.out.println("You set id2=" + id02.getId());
        
        
    }
    
}

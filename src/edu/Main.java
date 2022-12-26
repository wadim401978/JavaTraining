package edu;
//import edu.training.statics.Solution; //inner and nested classes training
//import edu.training.wrappers.Solution; //wrappers training
//import edu.training.primitives.ints.Solution;
//import edu.training.primitives.doublefloat.Solution;
//import edu.training.primitives.operations.Solution;
import edu.blinov.Solution;

public class Main {
    public static void main(String... errors) {
        Solution.main(); 
        

        main("string value"); //- программа выполнится
        //main(errors); //- программа зациклится
        
    }
    
    /*этот блок скомпилируется и выполнится т.к. в основном блоке
    main("ddd");
    */
    public static void main(String aaa) {
        System.out.println("This is " + aaa);
    }
    
}

package edu.training.statics.child;

import edu.training.statics.Classes;

public class ClassesChild extends Classes {
    
    /*private Inner innerInstance;
        =mistake: 
        Inner class has DEFAULT access modificator 
        (for the same packege only)
    */
    
    /*correct: Outer class has PROTECTED access modificator*/
    private Outer outerInstance;
    
    public Outer getOuterInstance() {
        return outerInstance;
    }

    public void setOuterInstance(Outer outerInstance) {
        this.outerInstance = outerInstance;
    }
    
}

package edu.training.statics;

public class Classes {
    
    
    /*NESTED(вложенный) class*/
    protected static class Outer {
        private String name;

        public String getName() {
            /*
                =mistake: 
                попытка в статическом классе обратиться к нестатическим сущностям
            */
            //Inner inner = new Inner();
            
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        
        public static void info() {
            System.out.println("=====You use Outer class!=====");
        }
    }
    
    /*INNER(внутренний) class*/
    class Inner {
        /*static void info() {*/ //===mistake
        void info() {
            System.out.println("=====You use Inner class!=====");
        }
        
        /*public static int id;*/ //===mistake
        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
    
}

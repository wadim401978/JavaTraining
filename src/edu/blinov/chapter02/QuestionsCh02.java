package edu.blinov.chapter02;

/**
 *
 * @author vadimsorokin
 */
public class QuestionsCh02 {

    static void q2_1() {
        System.out.println("Blinov. page51. q2.1. строки, компиляция которых не приведет к ошибке (3). ");
        Object var9 = 356f;
        double var2 = 356f;
        float var3 = 356f;
        System.out.println("" + var9 + " " + var2 + " " + var3 + " " + var9.equals(var3));
//      System.out.println("var9+1=" + (var9+1));//mistake
        System.out.println("var9+1=" + var9 + 1 + " конкатенация");
    }

    static void q2_3() {
        System.out.println("Blinov. page52. q2.3. ");
        double x = 0, y = 2, z;
        z = y / x;
        System.out.println("z=" + z + "; y = " + y + "; x = " + x);
        //2) z=Infinity
    }

    static void q2_8() {
        System.out.println("Blinov. page53. q2.8. ");
        int[] mas1 = new int[24];
        Integer mas2[] = new Integer[24];
//        char[] mas3 = new Character[]{'a', 'b', 'c'};
//        Item[] mas4 = new Item{new Item() , new Item()};
        double[] mas5 = {5, 10, 15, 20};
        int[] mas6[] = new int[4][5];
        int mas7[][] = new int[4][];
        
        
        char[] mas3 = {'a', 'b', 'c'};
        Item[] mas4 = {new Item() , new Item()};
        //int _3d;
    }

    public static void main() {
        q2_4();
    }

    static void q2_4() {
        System.out.println("Blinov. page52. q2.4. ");
        MedicalStaff medic = new HeadDoctor();

        if (medic instanceof Nurse) {

            System.out.println("Nurse");

        } else if (medic instanceof Doctor) {

            /**
             * это выведется, 
             * т.к. else if (medic instanceof Doctor) записано раньше, 
             * чем else if (medic instanceof HeadDoctor)
            */
            System.out.println("Doctor"); 

        } else if (medic instanceof HeadDoctor) {

            System.out.println("HeadDoctor");

        }
        
        /*FROM Вязовик */
        MedicalStaff[] m1 = new MedicalStaff[3];
        MedicalStaff[] m2 = new HeadDoctor[3];
        HeadDoctor hd[] = null;
        m1[0] = new MedicalStaff();
        //m2[0] = new MedicalStaff(); //mistake!
        m2[0] = new HeadDoctor();
        hd = (HeadDoctor[]) m2;
        
    }

}

class Item {}

class MedicalStaff {
}

class Doctor extends MedicalStaff {
}

class Nurse extends MedicalStaff {
}

class HeadDoctor extends Doctor {
}

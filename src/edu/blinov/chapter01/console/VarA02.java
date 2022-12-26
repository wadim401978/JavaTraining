package edu.blinov.chapter01.console;

public class VarA02 {
    public static void main(String... bubu) {
        //menu: Run->Set Project configuration->Customize->Categories:Run=>Arguments;
        //Знайка шёл гулять на речку
        for(int i=bubu.length-1; i >= 0; i--) {
            System.out.print (bubu[i] + " ");
        }
        System.out.println("");
    }
}

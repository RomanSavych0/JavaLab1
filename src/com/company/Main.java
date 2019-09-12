package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
////////////////////////////////////////////////////////////
        System.out.println("Hello Word");
        ///////////////////////////////////////////////
        SimpleClass obj = new SimpleClass();
        System.out.println(obj.integerVariable);
        System.out.println(obj.charVariable);

//////////////////////////////////////////////////////////////////////////////////
        /* TASK 3
        Scanner in = new Scanner(System.in);
        int num;
        for (int i = 0; i <3 ; i++) {
            System.out.println("Input Number");

             num = in.nextInt();
            System.out.println("You number" + num);
        }
        */
        Intervals intervals = new Intervals(10 , 30);

            intervals.buildFibonachiRow(5);

    }


}

    /////////////////////////////////////////////////////////////////////









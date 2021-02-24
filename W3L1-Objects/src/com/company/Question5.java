package com.company;

public class Question5 {

    void table(){
        //print multiplication table from 1 to 10
        System.out.println("\nmultiplication table\n");
        int counter=0;


            do{
                for(int i=1; i<=12; i++) {
                    for(int y=1; y<=12; y++){
                        System.out.println(i + " x " + y + " = " + (i*y));

                    }
                    counter++;
                }

            }while(counter <12);




    }
}

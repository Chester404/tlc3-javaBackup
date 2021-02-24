package com.company;

public class Question6 {

    private int counter =0, randoms;

    public void  sixNumbers(){

        while(counter <6){
             randoms = (int)(Math.random()*49)+1;
            System.out.print(randoms+" ");
            counter++;
        }
        takeARandomNum(randoms);
    }


    public void takeARandomNum(int a){
       int randoms1 = (int)(Math.random()*a)+1;

        System.out.println("The random number per your random range is: "+randoms1);
    }
}

package com.company;

public class Question4 {

    int min=-3, max=3, stopper, stopper1=1;

    public void stopAtZeroWhile(){

        do{
            stopper = (int)(Math.random()*(max-min))+min;
            System.out.println(stopper);
        }while(stopper !=0);
        System.out.println("\n");
    }

    public void stopAtZeroDo(){
        while(stopper1 != 0){

            stopper1 = (int)(Math.random()*(max-min))+min;
            System.out.println(stopper1);
        }
        System.out.println("\n");
    }


}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");

        Question2 rand = new Question2();
        rand.RandomNumber();

        Question3 test029 = new Question3();
        test029.singleDigit();

        Question4 stopAtWhile = new Question4();
        stopAtWhile.stopAtZeroWhile();

        Question4 stopAtDo = new Question4();
        stopAtDo.stopAtZeroDo();

        Question5 display = new Question5();
        display.table();

        Question6 print6Numbers = new Question6();
        print6Numbers.sixNumbers();
       /* int randomNum =(int) (Math.random() * 100) +1;

        if (randomNum%2 == 0){
            System.out.println(randomNum +" is even");
        }else{
            System.out.println(randomNum +" is even");
        }

        if (randomNum == 0){
            System.out.println("Frozen");
        }else if(randomNum >= 1 & randomNum <=14){
            System.out.println("cold");
        }else if(randomNum >= 15 & randomNum <= 24){
            System.out.println("cool");
        }else if(randomNum >= 25 & randomNum <=40){
            System.out.println("warm");
        }else if(randomNum >= 41 & randomNum <=60){
            System.out.println("hot");
        }else if(randomNum >=61 & randomNum <=80){
            System.out.println("very hot");
        }else if(randomNum >=81 & randomNum <=99){
            System.out.println("extremely hot");
        }else if(randomNum == 100){
            System.out.println("boiling");
        }else{
            System.out.println("THis cannot be happening");
        }

        */

    }
}

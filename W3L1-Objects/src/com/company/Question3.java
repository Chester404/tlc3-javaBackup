package com.company;

public class Question3 {
    private int zero29;

     public void singleDigit(){
         zero29 = (int)(Math.random()*9)+1;
         System.out.print(zero29);

        switch (zero29){
            case 0:
                System.out.println(" zero\n");
                break;
            case 1:
                System.out.println(" one\n");
                break;
            case 2:
                System.out.println(" two\n");
                break;
            case 3:
                System.out.println(" three\n");
                break;
            case 4:
                System.out.println(" four\n");
                break;
            case 5:
                System.out.println(" five\n");
                break;
            case 6:
                System.out.println(" six\n");
                break;
            case 7:
                System.out.println(" seven\n");
                break;
            case 8:
                System.out.println(" eight\n");
                break;
            case 9:
                System.out.println(" nine\n");
                break;

        }
    }


}

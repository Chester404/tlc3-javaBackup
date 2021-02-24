package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Lion kofi = new Lion();
        int i = kofi.getAge();


        Trade t1 = new Trade("stock","APPL", 100, 15.25);
        Trade t2 = new Trade("bonds","CBH",200,456.45);
        Trade t3Noprice = new Trade("treasury","TRX",50,0);


        System.out.println(t1.ID);
        System.out.println(t2.quantity+"\n");
        t2.toString();
        System.out.println("\n");
        t3Noprice.setPrice(34.45);
        System.out.println(t3Noprice.price);
    }
}

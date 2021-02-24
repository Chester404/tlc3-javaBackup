package com.company;

import com.company.farm.Animal;

public class Practice {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Animal();

        animal2.setName("Phisher");

        System.out.println("Animal -> " + animal.getName());
        animal.setName("Moose");
        System.out.println("Animal -> " + animal.getName());
        System.out.println("Animal -> " + animal2.getName());
        System.out.println("Amimal -> " + animal.user);
        //System.out.println("Animal -> " + animal.name);
    }
}

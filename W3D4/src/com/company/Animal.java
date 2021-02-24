package com.company;

public class Animal {
    private String name;
    private int height =40;
    private double weight =7.5;
    protected int age =3;

    public void animalDetails(){
        System.out.println("animal name is  : "+ name);
        System.out.println("animal height is  : "+ height);
        System.out.println("animal weight is  : "+ weight);
        System.out.println("animal age is  : "+ age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }
}

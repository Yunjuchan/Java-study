package com.example;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    private void bark() {
        System.out.println(this.getName() + " " + "멍멍!");
    }

    @Override
    public void sound() {
        bark();
    }
}

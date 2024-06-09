package com.example;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    private void meow() {
        System.out.println(this.getName() + " " + "야옹!");
    }

    @Override
    public void sound() {
        meow();
    }
}

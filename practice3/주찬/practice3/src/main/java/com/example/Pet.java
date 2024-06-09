package com.example;

public class Pet implements Animal {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println(name + "make a sound.");
    }

    @Override
    public void eat() {
        System.out.println(name + "is eating.");
    }
}

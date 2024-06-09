package com.example;
import java.util.function.BiFunction;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b, int c);
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("바둑이");
        Pet cat = new Cat("치즈");
        dog.sound();    // 바둑이 멍멍!
        cat.sound();    // 치즈 야옹!

        System.out.println(dog instanceof Animal);  // true
        System.out.println(dog instanceof Pet);     // true
        System.out.println(dog instanceof Dog);     // true
        System.out.println(dog instanceof Cat);     // false

        System.out.println(cat instanceof Animal);  // true
        System.out.println(cat instanceof Pet);     // true
        System.out.println(cat instanceof Dog);     // false
        System.out.println(cat instanceof Cat);     // true


        BiFunction<Integer, Integer, Integer> calcuation = (a, b) -> (a + b) * (a - b);
        int result = calcuation.apply(100, 1);
        System.out.println("result = " + result);

        // 세 개의 숫자를 더하는 람다 표현식
        Calculator add = (a, b, c) -> a + b + c;

        // 세 개의 숫자를 곱하는 람다 표현식
        Calculator multiply = (a, b, c) -> a * b * c;

        System.out.println("Addition: " + add.calculate(10, 5, 2)); // Addition: 17
        System.out.println("Multiplication: " + multiply.calculate(10, 5, 2)); // Multiplication: 100
    }
}
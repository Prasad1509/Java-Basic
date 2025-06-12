package Pandas;

import java.util.Scanner;
1
// Table Program
class Table {
    public void printTable() {
        System.out.println("Table of 5 is:");
        for (int i = 5; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
2
// Factors Program
class Factors {
    public void printFactors(int number) {
        System.out.println("Factors of " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
3
// Fibonacci Program
class Fibbo {
    public void printFibonacci() {
        int num1 = 0, num2 = 1, num3;
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 0; i <= 10; i++) {
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
4
// Prime Number Program
class Prime {
    public void printPrimes(int num) {
        int count;
        for (int i = 1; i <= num; i++) {
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0)
                System.out.println(i);
        }
    }
}
5
// Triangle Pattern
class TrianglePattern {
    public void printTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
6
// Array Sum
class ArraySum {
    public void printSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum of elements in the array: " + sum);
    }
}
7
// Person Class (Demo3)
class Person {
    private String name;
    private int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }

    public int getAge() { return age; }
}
8
// Car & Vehicle
class Vehicle {
    public void Drive() {
        System.out.println("Drive safely");
    }
}

class Car extends Vehicle {
    @Override
    public void Drive() {
        System.out.println("Repairing a car");
    }
}

// Cheetah & Animal1
class Animal1 {
    public void Move() {
        System.out.println("Animal Running");
    }
}

class Cheetah extends Animal1 {
    @Override
    public void Move() {
        System.out.println("Cheetah moves safely");
    }
}
9
// Shape Interface & Implementations
interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length,double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base,double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}
10
// Playable Interface & Games
interface Playable {
    void play();
}

class Football implements Playable {
    public void play() {
        System.out.println("Playing Football");
    }
}

class Vollyball implements Playable {
    public void play() {
        System.out.println("Playing Vollyball");
    }
}

class Basketball implements Playable {
    public void play() {
        System.out.println("Playing Basketball");
    }
}
11
// Animal Sounds
class Animal {
    public void sound() {
        System.out.println("Animal makes generic sound");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Meow meow");
    }
}

class Bird extends Animal {
    public void sound() {
        System.out.println("Chirps");
    }
}
12
// Main Program Class
public class CompleteProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Table
        new Table().printTable();

        // Factors
        System.out.print("Enter a number for factors: ");
        int number = scanner.nextInt();
        new Factors().printFactors(number);

        // Fibonacci
        new Fibbo().printFibonacci();

        // Prime numbers up to 30
        new Prime().printPrimes(30);

        // Triangle Pattern
        System.out.print("Enter number of rows for triangle: ");
        int rows = scanner.nextInt();
        new TrianglePattern().printTriangle(rows);

        // Array Sum
        new ArraySum().printSum(new int[]{1, 2, 3, 4, 5});

        // Person Details
        Person p1 = new Person("Rutik", 21);
        Person p2 = new Person("Rohan", 21);
        System.out.println("Person 1: " + p1.getName() + ", Age: " + p1.getAge());
        System.out.println("Person 2: " + p2.getName() + ", Age: " + p2.getAge());

        // Car
        new Car().Drive();

        // Cheetah
        new Cheetah().Move();

        // Shape Areas
        Shape r = new Rectangle(6, 4);
        Shape c = new Circle(5);
        Shape t = new Triangle(6, 4);
        System.out.println("Area of Rectangle: " + r.getArea());
        System.out.println("Area of Circle: " + c.getArea());
        System.out.println("Area of Triangle: " + t.getArea());

        // Playable Games
        Playable f = new Football();
        Playable v = new Vollyball();
        Playable b = new Basketball();
        f.play();
        v.play();
        b.play();

        // Animal Sounds
        new Cat().sound();
        new Bird().sound();

        scanner.close();
    }
}


package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------Store-----------");
        Store store = new Store(3, "Ikea", "34555859", 50);
        System.out.println("Enter the number of products you want to buy ");
        int numberOfProductToSell = scanner.nextInt();
        store.sellProducts(numberOfProductToSell);
        store.printStoreInfo();

//------------------------------------------------------------
        Person person1 = new Person("Anna", "Khachatryan", 18, "female", "AN123456");
        System.out.println("---Person1----");
        person1.personInfo();

        Person person4 = new Person("Armen9", "Mnatcakanyan", 17, "fema", "AN123468");
        System.out.println("---Person4----");
        person4.personInfo();

        Person person2 = new Person("Armen", "Mnatcakanyan7", 19, "male", "AM12346");
        System.out.println("---Person2----");
        person2.personInfo();

        Person person3 = new Person("Armen", "Mnatcakanyan", 57, "male", "AN123464");
        System.out.println("---Person3----");
        person3.personInfo();
//------------------------------------------------------------

        System.out.println("----------Shape------------------");
        Circle circle = new Circle(5);
        Square square = new Square(5);
        double squareArea = square.getArea();
        double squarePerimeter = square.getPerimeter();
        double circleArea = circle.getArea();
        double circlePerimeter = circle.getPerimeter();
        System.out.println("Square -- Area is " + squareArea + ",Perimeter is " + squarePerimeter);
        System.out.println("Circle -- Area is " + circleArea + ",Perimeter is " + circlePerimeter);

    }
}

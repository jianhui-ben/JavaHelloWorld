package com.java_test;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
//        //sout abbv to print out 'hello world' with \ escape
//        System.out.println("Hello World" + "\"Ben\"");
//
//        //primitive and reference variables in java
//        int age = 10;
//        int herAge = age;
//        System.out.println(herAge);
//
//        Point point1 = new Point(1, 2);
//        Point point2 = point1;
//        point1.x = 3;
//        System.out.println(point2.getX());
//
//        //every time a new string object is generated
//        String s1 = "test 1";
//        String s2 = s1;
//        s1 = s1.replace('1', '2');
//        System.out.println(s1);
//        System.out.println(s2);
//
//        //array
//        int [] numbers = new int[5];
//        int [][] matrix = new int[4][6];
//        numbers[0] = 12;
//        System.out.println(Arrays.toString(numbers));
//        matrix[0][0] = 7;
//        System.out.println(Arrays.deepToString(matrix));
//
//        //casting
//        double x = 1.1d;
//        int y = (int)x + 2;
//        System.out.println(y);
//
//        String x_str = "1";
//        int y_str = Integer.parseInt(x_str) + 1;
//        System.out.println(y_str);
//
//        //Math class
//        System.out.println(Math.random() * 100);
//        Math.round(1.45);
//        Math.ceil(1.2);
//        Math.floor(1.1);
//        Math.max(1.2F, 4.3);
//
//        //reading inputs
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//        System.out.println("Hi, " + scanner.nextLine().trim());
//
//        //if statement:
//        int temp = 50;
//        if (temp > 55) {
//            System.out.println("Hot day!");
//        }
//        else if (temp > 20 && temp < 30) {
//            System.out.println("nice");
//        }
//        else {
//            System.out.println("others");
//        }

//        //ternary operator in java
//        int temp = 50;
//        String hot_day_or_not = temp > 50 ? "yes": "no";
//
//        // fizz (3) and buzz (5) exercise
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number: ");
//        int input = scanner.nextInt();
//        if (input % 3 == 0 && input % 5 == 0)
//            System.out.println("FizzBuzz");
//        else if (input % 3 == 0)
//            System.out.println("Fizz");
//        else if (input % 5 == 0)
//            System.out.println("Buzz");
//        else
//            System.out.println(input);
//
//        //for loop and while loop
//        for (int i = 0; i < 5; i++)
//            System.out.println("hi");
//        String input = "";
//        Scanner scanner = new Scanner(System.in);
//        while (!input.equals("quit")){
//            System.out.print("Input: ");
//            input = scanner.nextLine().toLowerCase();
//        }

        //break, continue is the same as python
        //for each loop
        String[] people = {"Ben", "Love", "Aiko"};
        for (String person:people) {
            System.out.println(person);
        }
    }
}
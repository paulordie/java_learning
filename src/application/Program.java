package application;

import entities.Product;
import entities.Triangle;
import util.Calculator;

import java.util.Locale;
import java.util.Scanner;


public class Program {

//    public static final double PI = 3.14159; ;// final diz que o valor vai permanecer e nao vai mudar

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Enter Radius: ");
        double radius = sc.nextDouble();

        double c = calc.circunference(radius);
        double v = calc.volume(radius);

        System.out.printf("circunferencia é :%.2f%n", c);
        System.out.printf("volume é :%.2f%n", v);

        System.out.printf("PI é: %.2f%n", calc.PI);

        sc.close();
    }
//    public static double circunference(double radius){
//        return 2.0 * PI * radius;
//    }
//
//    public static double volume(double radius){
//        return 4.0 * PI * radius * radius * radius / 3.0;
//    }
}

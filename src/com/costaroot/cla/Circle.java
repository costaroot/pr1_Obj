package com.costaroot.cla;

import java.util.Scanner;

public class Circle {
    private double radius;
    private Scanner sc;

    public Circle (){
        sc = new Scanner(System.in);
        Exception exception;
        System.out.println("Please, enter radius of the circle");
        this.radius = sc.nextDouble();
    }

    public double area (){
        return Math.PI * Math.pow(radius,2);
    }
}
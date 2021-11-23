package com.costaroot.cla;

import java.util.Scanner;

public class Executor {
    private Circle circle;

    public Executor(){
        this.circle = new Circle();
    }

    private void carRun(){
        Car bmw = new Car ("bmw");
        Car fiat = new Car("fiat");
        bmw.startEngine();
        bmw.startMove(50.5);
        fiat.startMove(33);
        System.out.println("\nNumber produced cars are "+fiat.getCreatedCar());
    }
    public void run(){
        System.out.println("We run all project");
        System.out.printf("Area: %.2f",circle.area()," ");
        this.carRun();
    }
}

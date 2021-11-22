package com.costaroot.cla;

public class Car {
    private String carName;
    private static int createdCar = 0;
    private boolean isEngine;
    private double moveSpeed;
    private boolean isMove;

    public Car (String carName){
        createdCar++;
        this.carName = carName;
        isEngine = false;
        moveSpeed = 0;
        isMove = false;
    }

    public int getCreatedCar(){
        return createdCar;
    }

    public void startEngine(){
        if (isEngine){
            System.out.println("Engine has already started. Do not do it");
        }else {
            isEngine = true;
            System.out.println("Engine turn on");
        }
    }


}
package com.driver;

 public class Vehicle {

     private int currentDirection;
     int currentSpeed;
     String name;


     public Vehicle(String name) {

        //Initializing variables
        this.name = name;
        this.currentDirection = 0;
        this.currentSpeed = 0;
    }

     public int getCurrentDirection() {
         return currentDirection;
     }
     public int getCurrentSpeed(){
         return currentSpeed;
     }

     public void steer(int direction){
        //direction is in degrees, add it to the current direction

        //direction is in degrees, adding it to the current direction
        this.currentDirection = direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection

        //setting the values of currentSpeed and currentDirection
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){
        this.currentSpeed  = 0;
        if(currentSpeed == 0){
            System.out.println("stop method called - The vehicle is stopped");
        }
    }

}


  /*  public int getCurrentDirection() {

        return currentDirection;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public String getName() {
        return name;
    }*/


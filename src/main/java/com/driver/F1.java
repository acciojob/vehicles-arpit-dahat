package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned

        super(name,4,4,6,isManual,"sport",5);
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        int newSpeed = getCurrentSpeed() + rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         @@ -19,12 +20,42 @@ public void accelerate(int rate){
         */

        if(newSpeed == 0) {

            //Stop the car, set gear as 1
            stop();
            changeGear(1);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            if(newSpeed > 250) {

                changeGear(6);
                changeSpeed(newSpeed, getCurrentDirection());
            }
            else if(newSpeed > 200) {

                changeGear(5);
                changeSpeed(newSpeed, getCurrentDirection());
            }
            else if(newSpeed > 150) {

                changeGear(4);
                changeSpeed(newSpeed, getCurrentDirection());
            }
            else if(newSpeed > 100) {

                changeGear(3);
                changeSpeed(newSpeed, getCurrentDirection());
            }
            else if(newSpeed > 50) {

                changeGear(2);
                changeSpeed(newSpeed, getCurrentDirection());
            }
            else if(newSpeed > 0) {

                changeGear(1);
                changeSpeed(newSpeed, getCurrentDirection());
            }
        }
    }
}
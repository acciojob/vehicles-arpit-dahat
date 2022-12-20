package com.driver;

public class WaterVehicle{

    private String name;
    private int capacity;

    public void Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        return;
    }

    public String getVehicleName() {
        return name;
    }

    public int getVehicleCapacity() {
        return capacity;
    }
}

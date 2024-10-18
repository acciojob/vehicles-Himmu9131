package com.driver;

import com.driver.WaterVehicle;

public class Boat implements WaterVehicle {
    private String name;
    private int capacity;

    public Boat(String name,int capacity){
     this.name=name;
     this.capacity=capacity;
    }
    public String getBoat() {
        return name;
    }

    public void setBoat(String boat) {
        this.name = boat;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return this.name;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }
}

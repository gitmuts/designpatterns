package com.coop.icu;
public class VehicleFactory <T extends Vehicle> {
    
    private T vehicle;

    public void set(T t) { this.vehicle = t; }
    
    public T get() { return vehicle; }

    public void carDraw(T t){
        t.draw();
    }

    public void carDraw2() {
        vehicle.draw();
    }
}
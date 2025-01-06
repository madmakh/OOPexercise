package org.example;

public class Car {

    String color;
    String model;
    String price;
    Boolean isMechanic;

    public Car() {
    }

    public Car(String color, String model, String price, Boolean isMechanic) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.isMechanic = isMechanic;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Boolean getMechanic() {
        return isMechanic;
    }

    public void setMechanic(Boolean mechanic) {
        isMechanic = mechanic;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                ", isMechanic=" + isMechanic +
                '}';
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {

        ////////////////////
        Car car = new Car();
        car.setModel("BMW");
        car.setColor("black");
        car.setPrice("$50.000");
        car.setMechanic(true);
        System.out.println(car.toString());

        ///////////////////////

        RightAngledTriangle rightAngledTriangle = new RightAngledTriangle();
        rightAngledTriangle.setSide1(4);
        rightAngledTriangle.setSide2(5);
        rightAngledTriangle.setSide3(7);
        System.out.println(rightAngledTriangle.toString());


        //////////////////////

        Person person = new Person();
        person.setFullname("Alex Johnson");
        person.setPhoneNumber("+998909900000");
        person.setPlaceOfBirth("Australia");
        person.setYearOfBirth(1996);
        person.setOccupation("student");
        person.setOccupation("Businessman");
        person.setMale(true);
        System.out.println(person.toString());










    }
}
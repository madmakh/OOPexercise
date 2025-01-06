package org.example;

public class Person {
    String fullname;
    String phoneNumber;
    String placeOfBirth;
    int yearOfBirth;
    String occupation;
    Boolean isMale;

    public Person()  {

    }


    public Person(String fullname, String phoneNumber, String placeOfBirth, int yearOfBirth, String occupation, Boolean isMale) {
        this.fullname = fullname;
        this.phoneNumber = phoneNumber;
        this.placeOfBirth = placeOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.occupation = occupation;
        this.isMale = isMale;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullname='" + fullname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", occupation='" + occupation + '\'' +
                ", isMale=" + isMale +
                '}';
    }
}

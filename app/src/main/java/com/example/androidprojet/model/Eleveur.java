package com.example.androidprojet.model;

import java.io.Serializable;

public class Eleveur  implements Serializable {
    private int id;
    private String fullNameFr;
    private String fullNameAr;

    private String cin;
    private String address;
    private String birthdate;
    private String gender;
    private String  phoneNumber;
    private String city;
    private String profile;


    public void setId(int id) {
        this.id = id;
    }

    public void setFullNameFr(String fullNameFr) {
        this.fullNameFr = fullNameFr;
    }

    public void setFullNameAr(String fullNameAr) {
        this.fullNameAr = fullNameAr;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    public void setPhoneNumber(long phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public int getId() {
        return id;
    }

    public String getFullNameFr() {
        return fullNameFr;
    }

    public String getFullNameAr() {
        return fullNameAr;
    }

    public String getCin() {
        return cin;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getGender() {
        return gender;
    }

//    public long getPhoneNumber() {
//        return phoneNumber;
//    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public String getProfile() {
        return profile;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Eleveur{" +
                "id=" + id +
                ", fullNameFr='" + fullNameFr + '\'' +
                ", fullNameAr='" + fullNameAr + '\'' +
                ", cin='" + cin + '\'' +
                ", address='" + address + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", city='" + city + '\'' +
                ", profile='" + profile + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

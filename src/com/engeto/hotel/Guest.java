package com.engeto.hotel;

import java.time.LocalDate;

public class Guest {
    private String firstName;
    private String surName;
    private LocalDate birthday;


    public Guest(String firstName, String surName, LocalDate birthday){
        this.firstName = firstName;
        this.surName = surName;
        this.birthday = birthday;
    }

    public String description(){
        return this.firstName + " " + this.surName +" "+ this.birthday;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}


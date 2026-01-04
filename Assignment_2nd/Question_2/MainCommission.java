package com.Question_2;

public class MainCommission {

    public static void main(String[] args) {

        // Default constructor calling
        Student s = new Student();

        // Commission object
        Commission c = new Commission();
        c.acceptDetails();
        c.calculateCommission();
    }
}

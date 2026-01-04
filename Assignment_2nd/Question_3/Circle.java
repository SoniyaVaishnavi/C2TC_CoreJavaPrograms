package com.Question_3;

import java.util.Scanner;

class Circle {

    double radius;
    String colour;

    //input
    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of the circle: ");
        radius = sc.nextDouble();

        System.out.print("Enter Colour of the circle: ");
        colour = sc.next();
    }

    //calculate area
    void calcArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
    
    

    public static void main(String[] args) {
        Circle c = new Circle();
        c.getInput();
        c.calcArea();
        
        
    }
    
    
}


package com.Question_1;
import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        String fullName = sc.nextLine();
        int rollNumber = sc.nextInt();
        char grade = sc.next().charAt(0);
        String percentage = sc.next();

        // Output
        System.out.println("Name of the student is: "+fullName);
        System.out.println("Roll no of the student is: "+rollNumber);
        System.out.println("Grade of the student is: "+"\t" + grade);
        System.out.println("Percentage of the student is: "+"\t"+ percentage);

        sc.close();
    }
}

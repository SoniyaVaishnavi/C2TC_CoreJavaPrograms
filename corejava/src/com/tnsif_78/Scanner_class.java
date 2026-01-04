package com.tnsif_78;

import java.util.Scanner;

public class Scanner_class{
		
		public void run() {
	       Scanner scan=new Scanner(System.in);
			
			System.out.println("enter your name :");
			String name=scan.nextLine();
			
			System.out.println("enter your age :");
			int age=scan.nextInt();		
			
			
			System.out.println("your name :"+name);
			System.out.println("your age :" +age);
			scan.close();
			
			
		}
		
		public static void main(String[] args) {
			Scanner_class scanner=new Scanner_class();
			scanner.run();
			
			
		}
		
		
		

	}


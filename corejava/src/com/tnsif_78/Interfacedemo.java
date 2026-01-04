package com.tnsif_78;
	
	interface Shape{
		 
		 //declaration
	    void draw();
	}

	public class Interfacedemo implements Shape{
		
		//implementation or explanation
		public void draw() {
			System.out.println("Drawing a circle in an interface");
		}

		public static void main(String[] args) {
			
			
			Interfacedemo id = new Interfacedemo();
			id.draw();
			

			
		}

	}




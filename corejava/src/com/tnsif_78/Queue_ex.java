package com.tnsif_78;

	import java.util.LinkedList;
	import java.util.Queue;

	public class Queue_ex {

		public static void main(String[] args) {
			
			Queue<Integer> q = new LinkedList<>();
			
			
			
			for(int i=0;i < 5; i++)
				q.add(i);
			
			
			System.out.println("Elements of Queue: "+q);

			
			int removable = q.remove();
			System.out.println("Removed Element: "+ removable);
			
			
			int head = q.peek();
			System.out.println("Head of the Element: "+ head);
			
			
			int size = q.size();
			System.out.println("Size of queue: "+ size);
		}
		
		

	}



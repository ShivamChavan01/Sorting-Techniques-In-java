package com.kn.ArrayTasks;

import java.util.Scanner;

public class BubbleSortDemo {

	public static void main(String[] args) {
   //Array Declaration
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array=");
		int arr[]=new int[scan.nextInt()];
		
		
		//array initialization
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the array elements "+(i+1));
			arr[i]=scan.nextInt();
		}
		
		//array Traversing before the bubble sort
		System.out.println("The Array elements before sorting =");
		System.out.print("[");
		for(int i=0;i<arr.length;i++) 
             
		{
			
			System.out.print(arr[i]+" ");
			
		}
		System.out.print("]");
		System.out.println(" ");
		
		
		
		//object creation for calling the method
		
		BubbleSort Bubble=new BubbleSort();
		Bubble.bubbleSort(arr);
		
		
		
		
		
		//array Traversing after the bubble sort
		
		System.out.println("The Array elements after sorting =");
		System.out.print("[");
		for(int i :arr) 
             
		{
			
			System.out.print(i+" ");
			
		}
		System.out.print("]");
		scan.close();
	}

}

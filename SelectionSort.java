package com.kn.ArrayTasks;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	//Array declaration
		System.out.println("Enter the array size");
		int arr[]=new int[scan.nextInt()];
		
		//array initialization
		System.out.println("Enter the array elements ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		SelectionSortApp sorting=new SelectionSortApp();
		for(int i:sorting.GetSort(arr)) {
			System.out.println(i);
		}
		
		
		
	  
	
	  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

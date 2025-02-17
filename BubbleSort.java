package com.kn.ArrayTasks;

public class BubbleSort {

	public static void main(Strings[] args){
        int arr[] = {1,3,56,777,8,5}
		int brr[]   = bubblesort(arr);

		for(int i=0;i<arr.length;i++){
		  System.out.println(arr[i]);
		}
		
		
		}
	
	public int [] bubbleSort(int arr[]) {
		  
		
		for(int i=0;i<arr.length-1;i++) 
		{
			boolean isSwapped=false;
			for(int j=0;j<arr.length-1-i;j++)
			{
				     if(arr[j]>arr[j+1]) 
				       {
					int swap=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=swap;
				       }
				isSwapped=true;
			}
			if(isSwapped==false) 
			{
				break;
			}
			
		}
		return arr;
		 
		
		
		
	}

}

package com.kn.ArrayTasks;

public class BubbleSort {

    public static void main(String[] args) { // ❌ Fixed "Strings" to "String"
        int arr[] = {1, 3, 56, 777, 8, 5,505,4848,8585,413,0}; // ❌ Missing semicolon

        BubbleSort bs = new BubbleSort(); // ❌ Need an instance to call a non-static method
        int sortedArr[] = bs.bubbleSort(arr);

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.println(sortedArr[i]);
        }
    }

    public int[] bubbleSort(int arr[]) {  // ❌ Changed method name from "bubblesort" to "bubbleSort"
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                    isSwapped = true; // ❌ This should be inside the if condition
                }
            }
            if (!isSwapped) { // ✅ Optimized check
                break;
            }
        }
        return arr;
    }
}

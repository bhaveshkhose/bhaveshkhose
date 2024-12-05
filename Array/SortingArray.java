package Array;

import java.util.Arrays;

public class SortingArray  {
	
	//for swaping the two number
	public static void swap(int a , int b) {
		System.out.println("a="+a);
		System.out.println("b="+b);
		int temp =b;
		b=a;
		a=temp;
		System.out.println("the value of a is:-"+a);
		System.out.println("the value of b is:-"+b);
		
		
	}
	
	//Selection sort of the array with time complexity of O(n^2),
	//and space Complexity of  O(1)
	public static String selectionSort(int[] arr) {
		
		for(int i =0 ; i< arr.length-1 ; i++) 
		{
			int minat = i;
			for(int j = i+1 ; j < arr.length ; j++)
			{
				
				if(arr[ minat] > arr[j]) {
					minat = j;
				}
				int temp = arr[minat];
				arr[minat] = arr[i];
				arr[i] = temp;
			}
			
			//System.out.println(Arrays.toString(arr));
			
			
			
		}
		return Arrays.toString(arr);
		
 }
	
	public static String bubbleSort(int[] nums) {
		
		
		int n = nums.length;
		for(int i =0 ; i < n -1 ; i++) {
			for(int j =0 ; j < n-1-i ; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] =temp; 
				}
			}
			
		}
		return Arrays.toString(nums);
		
	}
	
	
	
	public  static int binarySearch(int [] array , int target)
	{
		int start = 0;
		int end = array.length-1;
		
		while(start <= end) {
			int mid = (start + end )/ 2;
			if(array[mid] == target) {
				return mid;
				
			}
			else if(array[mid] < target) {
				
				start = mid +1;
			}
			else
			{
				end= 	mid -1;
			}
			
			
			
		}
		return -1;  // array does not contain that int
		
	}
	
	public static String insertionSort(int[] nums)
	{
		for(int i =1 ; i < nums.length-1 ; i++) {
			
			int temp = nums[i];
			int j = i-1;
			
			while( j >= 0 && nums[j] > temp) {
				
				nums[j] = temp ;
				j--;
			
			}
			nums[j+1] = temp;
			
		}
		
		return Arrays.toString(nums);
	}
	
	private static boolean contain(int[] arr , int ele) {
		for(int i =0 ; i < arr.length ; i++) {
			if(arr[i] == ele) {
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args)
	{
		
		int[] arr = {9,4,3,5,-1};
		System.out.println(contain(arr , -1));
//		insertionSort(arr);
//		System.out.println(selectionSort(arr));
//		System.out.println(insertionSort(arr));
//		
		
		
	}
}

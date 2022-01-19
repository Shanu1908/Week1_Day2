package week1.day2;

import java.util.Arrays;

public class SecondSmallestNumberInArray {
	

	public static void main(String[] args) {

		// Here is the input
		int[] data = {23,45,67,32,89,22};
		
		Arrays.sort(data);
		
		int secondLargest = data.length-2;
	
			System.out.println(data [secondLargest]);
		}
	}

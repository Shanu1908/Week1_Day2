package week1.day2;

import java.util.Arrays;

public class Secondlargestarray {
	

	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};
		
		Arrays.sort(data);
		
		int secondLargest = data.length-2;
	
			System.out.println(data [secondLargest]);
		}
	}
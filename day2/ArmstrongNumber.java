package week1.day2;

public class ArmstrongNumber {

public static void main(String[] args) {
              int input = 216; // (2*2*2)+(1*1*1)+(6*6*6) - > 216
              int originalnumber = input;
              int sum = 0;
              while(input > 0) {
            	  int rem = input % 10;
            	  
            	  sum = sum+ (rem*rem*rem); //0+ (6*6*6)
            	  
            	  input= input / 10; // 216 /10 - > 16
            	  
              }
              if(sum == originalnumber) {
            	  System.out.println("Given number is armstrong");
            	  
              }	  else {
            	  System.out.println("Given number is not armstrong");
            			  
              }       			  
}
}
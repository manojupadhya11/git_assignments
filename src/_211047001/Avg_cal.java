package _211047001;

import java.util.Scanner;

public class Avg_cal {
	public void findavg(){
		int N, count = 1;   
	      float  xF, averageF, sumF = 0;   
	      Scanner sc = new Scanner(System.in);     
	      System.out.println("Enter the value of N");  
	      N = sc.nextInt();  
	      while (count <= N)   
	             {   
	                  System.out.println("Enter the "+count+" number?");  
	                  xF = sc.nextInt();  
	                  sumF += xF;   
	                  ++count;   
	             }   
	                  averageF = sumF/N;   
	      System.out.println("The Average is "+averageF);  

	}
}

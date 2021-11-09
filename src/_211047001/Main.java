package _211047001;
import java.util.*;

import _211047001.Avg_cal;
import _211047001.Math_cal;
import _211047001.grade_cal;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int UC = 1; 
	    
	    while(true) {
	      
	      if(UC == 1) {
	        System.out.println("Enter your choice\n1 --> Average of N number\n2 -->Grade finder \n3 -->Mathematical Calculator"
	            + "\n4 --> Exit\n");
	        
	        int Choice = sc.nextInt();
	          
	        switch(Choice) {
	        
	          case 1:
	            Avg_cal ac = new Avg_cal(); 
	            ac.findavg(); // function call 
	            
	            break;
	            
	          case 2:
	        	  grade_cal  grd = new grade_cal(); 
	              grd.grade(); // function call 
	              break;
	              
	          case 3:
	            
	            System.out.println("Mathematical Calc");
	            Math_cal cal = new Math_cal(); 
	            cal.calc(); // function call
		        System.out.println("\nContinue(1 --> Yes/0 --> No) \n");
		        UC = sc.nextInt(); 
	            break;

	          
	          case 4:
	            System.out.println("Exit");
	            System.exit(0);
	            break;
	          
	          default:
	            System.out.println("wrong input");
	        } 
	        
	        System.out.println("\nContinue(1 --> Yes/0 --> No) \n");
	        UC = sc.nextInt(); 
	        
	      } 
	      
	      else {
	        System.out.println("Finished");
	        System.exit(0);
	      } 
	    } 
	  }


		

	}



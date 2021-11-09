package Problem3;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		int option;
		Scanner s = new Scanner(System.in);
		
		do{
			System.out.println("Select 1 for Mathematical calculator");
			System.out.println("Select 2 for Average calculator");
			System.out.println("Select 3 for Finding grade");
			System.out.println("Select 4 to exit ");
			option = s.nextInt();
			switch(option)
			{
			case 1:
				int m, n, opt, add, sub, mul;
				double div;
				while(true)
				{
					System.out.println("Enter 4 for addition");
					System.out.println("Enter 5 for subtraction");
					System.out.println("Enter 6 for multiplication");
					System.out.println("Enter 7 for division");
					System.out.println("Enter 8 to Exit");
					opt = s.nextInt();
					switch(opt)
					{
						case 4:
							System.out.print("Enter first number:");
							m = s.nextInt();
							System.out.print("Enter second number:");
							n = s.nextInt();
							add = m + n;
							System.out.println("Result:"+add);
							break;
	 
						case 5:
							System.out.print("Enter first number:");
							m = s.nextInt();
							System.out.print("Enter second number:");
							n = s.nextInt();	
							sub = m - n;
							System.out.println("Result:"+sub);
							break;
	 
						case 6:
							System.out.print("Enter first number:");
							m = s.nextInt();
							System.out.print("Enter second number:");
							n = s.nextInt();
							mul = m * n;
							System.out.println("Result:"+mul);
							break;
	 
						case 7:
							System.out.print("Enter first number:");
							m = s.nextInt();
							System.out.print("Enter second number:");
							n = s.nextInt();	
							div = (double)m / n;
							System.out.println("Result:"+div);
							break;    
	 
						case 8:
							System.exit(0);
					}
				    break;
				}
				//break;
		
	      
			case 2:
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
			      System.out.println("The Average is"+averageF);  
				  break;
			
			case 3:
				
					
					
			} 
		
		}while(true);
		s.close();
    }
}


package _211047001;
import java.util.Scanner;


public class Math_cal{
	public void calc() {
		Scanner sc = new Scanner(System.in);
		int c = 1;
		int m, n, opt, add, sub, mul;
		double div;
		while(true)
		{
			if(c == 1) {
				
	        System.out.println("1 --> Addition\n2 --> Subtaction\n3 --> Multiplication\n4 -->Division\n5--> exit \n");
	        opt = sc.nextInt();
			switch(opt)
			{
				case 1:
					System.out.print("Enter first number:");
					m = sc.nextInt();
					System.out.print("Enter second number:");
					n = sc.nextInt();
					add = m + n;
					System.out.println("Result:"+add);
					break;

				case 2:
					System.out.print("Enter first number:");
					m = sc.nextInt();
					System.out.print("Enter second number:");
					n = sc.nextInt();	
					sub = m - n;
					System.out.println("Result:"+sub);
					break;

				case 3:
					System.out.print("Enter first number:");
					m = sc.nextInt();
					System.out.print("Enter second number:");
					n = sc.nextInt();
					mul = m * n;
					System.out.println("Result:"+mul);
					break;

				case 4:
					System.out.print("Enter first number:");
					m = sc.nextInt();
					System.out.print("Enter second number:");
					n = sc.nextInt();	
					div = (double)m / n;
					System.out.println("Result:"+div);
					break;    

				case 5:
					System.exit(0);
					break;
			
			   }
			
			}
		}
		
	}
	

}

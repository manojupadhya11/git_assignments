package _211047001;
import java.util.*;
public class grade_cal {
	public void grade() {
	Scanner s = new Scanner(System.in);
	int marks;
	System.out.println("Enter the marks to find the grade");
	marks = s.nextInt();
	
	if(marks <= 59)
		System.out.println("Grade: F");
	else if(marks <= 69)
		System.out.println("Grade: D");
	else if(marks <= 79)
		System.out.println("Grade: C");
	else if(marks <= 89)
		System.out.println("Grade: B");
	else if(marks <= 100)
		System.out.println("Grade: A");

	}

  }


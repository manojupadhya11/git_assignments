package Pri;

public class Private {
	private String fname = "Manoj";
	private String lname = "Upadhya";
	private int YOB = 1999;
	private String  addr = "Manipal";

	public static void main(String[] args) {
		Private p = new Private(); 


		System.out.println("Name = "+p.fname+ " "+p.lname);
		System.out.println("Year of Birth = "+p.YOB);
		System.out.println("Address = "+p.addr);

	}

}



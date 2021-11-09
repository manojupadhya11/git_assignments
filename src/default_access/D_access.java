package default_access;

public class D_access {
	String fname = "Manoj";
	String lname = "Upadhya";
	int YOB = 1999;
	String  addr = "Manipal";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D_access person = new D_access();
		System.out.println("Name = "+person.fname+ " "+person.lname);
		System.out.println("Year of Birth = "+person.YOB);
		System.out.println("Address = "+person.addr);

	}

}

import java.util.*;  

class Employee{
	private String name;
	private String address;
	private String mobile;
	public void getter() {
	      System.out.println("Employee Details:");
	      System.out.println("Name:"+this.name);
	      System.out.println("Address:"+this.address);
	      System.out.println("Mobile:"+this.mobile);
	}

     public void setter(String name,String address,String mobile) {
	      this.name=name;
	      this.address=address;
	      this.mobile=mobile;
	 }
}

public class EmployeeMain {
	
	public static void main(String[] args)
	{
		String name,address,mobile;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name:");
		name=scan.next();
		System.out.println("Enter Address:");
		address=scan.next();
		System.out.println("Enter Mobile:");
		mobile=scan.next();
		Employee e=new Employee();
		e.setter(name,address,mobile);
		e.getter();
		
		
	}
}

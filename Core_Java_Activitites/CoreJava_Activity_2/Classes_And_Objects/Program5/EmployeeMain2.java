import java.util.Scanner;  

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

public class EmployeeMain2 {
	
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
		while(true) {
			System.out.println("Verify and Update the details:\nMenu:");
			System.out.println("1. Update Employee name");
			System.out.println("2. Update Employee Address");
			System.out.println("3. Update Employee mobile");
			System.out.println("4. All information correct/Exit");
			int choice;
			choice=scan.nextInt();
			if(choice==1) {
				System.out.println("Current employee name is:"+name);
				System.out.println("Enter ther name:");
				name=scan.next();
				e.setter(name, address, mobile);
			}
			else if(choice==2) {
				System.out.println("Current employee address is:"+address);
				System.out.println("Enter ther address:");
				address=scan.next();
				e.setter(name, address, mobile);
			}
			else if(choice==3) {
				System.out.println("Current employee mobile is:"+mobile);
				System.out.println("Enter ther mobile:");
				mobile=scan.next();
				e.setter(name, address, mobile);
			}
			else {
				break;
			}
			
		}
		
		System.out.println("The details are:");
		e.getter();
		
	}
}

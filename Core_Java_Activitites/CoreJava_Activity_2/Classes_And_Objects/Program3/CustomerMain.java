import java.util.Scanner;  

class Customer{
	private String name;
	private String address;
	private String mobile;
	public void getter() {
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

public class CustomerMain {
	
	public static void main(String[] args)
	{
		String details;
		String name,address,mobile;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the details:");
		details=scan.next();
		String[] arr = details.split(",", 0);
		name=arr[0];
		address=arr[1];
		mobile=arr[2];
		Customer e=new Customer();
		e.setter(name,address,mobile);
		e.getter();
		
		
	}
}

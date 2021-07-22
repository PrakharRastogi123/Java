import java.util.Scanner;  

class Company{
	private String name;
	private String employees;
	private String teamlead;
	public void getter() {
	      System.out.println("Name:"+this.name);
	      System.out.println("Employees:"+this.employees);
	      System.out.println("Lead:"+this.teamlead);
	}

     public void setter(String name,String employees,String teamlead) {
	      this.name=name;
	      this.employees=employees;
	      this.teamlead=teamlead;
	 }
}

public class CompanyMain {
	
	public static void main(String[] args)
	{
		String name,employees,teamlead;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the company name:");
		name=scan.nextLine();
		System.out.println("Enter the employees:");
		employees=scan.nextLine();
		System.out.println("Enter the TeamLead:");
		teamlead=scan.nextLine();
		String[] arr = employees.split(",", 0);
		int f=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(teamlead)) {
				f=1;
				break;
			}
		}
		if(f==1) {
			Company e=new Company();
			e.setter(name,employees,teamlead);
			e.getter();
		}
		else {
			System.out.println("Invalid input");
		}
		
		
	}
}

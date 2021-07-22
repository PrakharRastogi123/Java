import java.util.Scanner;



class Vehicle {
	private String make,vehiclenumber,fueltype;
	private int fuelcapacity,cc;
	public Vehicle(String make, String vehiclenumber, String fueltype, int fuelcapacity, int cc) {
		super();
		this.make = make;
		this.vehiclenumber = vehiclenumber;
		this.fueltype = fueltype;
		this.fuelcapacity = fuelcapacity;
		this.cc = cc;
	}
	public void displaymake() {
		System.out.println("****"+this.make+"****");
	}
	public void displaybasicinfo() {
		System.out.println("----Basic Information----");
		System.out.println("Vehicle Number: "+this.vehiclenumber);
		System.out.println("Fuel Capacity: "+this.fuelcapacity);
		System.out.println("Fuel Type: "+this.fueltype);
		System.out.println("CC: "+this.cc);
	}
}


class FourWheeler extends Vehicle {
	private int noofdoors;
	private String audiosystem;
	public FourWheeler(String make, String vehiclenumber, String fueltype, int fuelcapacity, int cc,int noofdoors,String audiosystem) {
		super(make, vehiclenumber, fueltype, fuelcapacity, cc);
		this.noofdoors=noofdoors;
		this.audiosystem=audiosystem;
		
	}
	public void displaydetailinfo() {
		System.out.println("----Detail Information----");
		System.out.println("Audio System: "+this.audiosystem);
		System.out.println("Number of doors: "+this.noofdoors);
		
	}

}

class TwoWheeler extends Vehicle {
	private boolean kickstartavailable;
	
	public TwoWheeler(String make, String vehiclenumber, String fueltype, int fuelcapacity, int cc,boolean kickstartavailable) {
		super(make, vehiclenumber, fueltype, fuelcapacity, cc);
		this.kickstartavailable=kickstartavailable;
		
		
	}
	public void displaydetailinfo() {
		System.out.println("----Detail Information----");
		if(this.kickstartavailable) {
			System.out.println("Kick Start Available: "+"yes");
		}
		else {
			System.out.println("Kick Start Available: "+"No");
		}
		
	}
}

public class VehicleMain {

	
	
		public static void main(String[] args)
		{
			int ch,ch2;
			 String make,vehiclenumber,fueltype;
			 int fuelcapacity,cc;
			 int noofdoors;
			 String audiosystem;
			 boolean kickstartavailable;
			System.out.println("1.Four Wheeler\n2.Two Wheeler\nEnter Vehicle Type:");
			Scanner sc = new Scanner(System.in);
			ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("Vehicle Make:");
				make=sc.next();
				System.out.println("Vehicle Number:");
				vehiclenumber=sc.next();
				System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
				ch2=sc.nextInt();
				if(ch2==1)
					fueltype="Petrol";
				else
					fueltype="Diesel";
				System.out.println("Fuel Capacity:");
				fuelcapacity=sc.nextInt();
				System.out.println("Engine CC:");
				cc=sc.nextInt();
				System.out.println("Audio System:");
				audiosystem=sc.next();
				System.out.println("Number of doors:");
				noofdoors=sc.nextInt();
				FourWheeler f=new FourWheeler( make, vehiclenumber,  fueltype,  fuelcapacity,  cc, noofdoors, audiosystem);
				f.displaymake();
				f.displaybasicinfo();
				f.displaydetailinfo();
			}
			else if(ch==2)
			{
				System.out.println("Vehicle Make:");
				make=sc.next();
				System.out.println("Vehicle Number:");
				vehiclenumber=sc.next();
				System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
				ch2=sc.nextInt();
				if(ch2==1)
					fueltype="Petrol";
				else
					fueltype="Diesel";
				System.out.println("Fuel Capacity:");
				fuelcapacity=sc.nextInt();
				System.out.println("Engine CC:");
				cc=sc.nextInt();
				System.out.println("Kick start Availability(yes or no):");
				kickstartavailable=sc.next() != null;
				TwoWheeler t=new TwoWheeler( make, vehiclenumber,  fueltype,  fuelcapacity,  cc,kickstartavailable );
				t.displaymake();
				t.displaybasicinfo();
				t.displaydetailinfo();
			}
			sc.close();
		}

	}



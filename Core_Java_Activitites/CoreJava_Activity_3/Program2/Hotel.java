import java.util.Scanner;

class HotelRoom{
	protected String hotelName;
	protected int numberOfSqFeet;
	protected Boolean hasTv;
	protected Boolean hasWifi;
	public HotelRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTv,Boolean hasWifi) {
		this.hotelName=hotelName;
		this.numberOfSqFeet=numberOfSqFeet;
		this.hasTv=hasTv;
		this.hasWifi=hasWifi;
	}
	public int CalculateTariff(int ratePerSqFeet) {
		return numberOfSqFeet*ratePerSqFeet;
	}
	public int getRatePerSqFeet() {
		return 0;
	}
	
}

class DeluxeRoom extends HotelRoom{
	protected int ratePerSqFeet;
	public DeluxeRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTv,Boolean hasWifi) {
		super(hotelName, numberOfSqFeet,hasTv,hasWifi );
		ratePerSqFeet=10;
	}
	public int getRatePerSqFeet() {
		if(hasWifi) {
			return ratePerSqFeet+2;
		}
		return ratePerSqFeet;
	}
}

class DeluxeACRoom extends DeluxeRoom{
	public DeluxeACRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTv,Boolean hasWifi) {
		super(hotelName, numberOfSqFeet,hasTv,hasWifi );
		ratePerSqFeet=12;
	}
}

class SuiteACRoom extends HotelRoom{
	private int ratePerSqFeet;
	public SuiteACRoom(String hotelName,Integer numberOfSqFeet,Boolean hasTv,Boolean hasWifi) {
		super(hotelName, numberOfSqFeet,hasTv,hasWifi );
		ratePerSqFeet=15;
	}
	public int getRatePerSqFeet() {
		if(hasWifi) {
			return ratePerSqFeet+2;
		}
		return ratePerSqFeet;
	}
}


public class Hotel {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1. Deluxe Room");
		System.out.println("2. Deluxe AC Room");
		System.out.println("3. Suite AC Room");
		System.out.println("Select Room Type:");
		int ch=scan.nextInt();
		if(ch==1) {
			System.out.println("Hotel Name:");
			String hotelName=scan.next();
			System.out.println("Room Square Feet Area:");
			int numberOfSqFeet=scan.nextInt();
			System.out.println("Room has TV (yes/no):");
			String Tv=scan.next();
			System.out.println("Room has Wifi (yes/no):");
			String Wifi=scan.next();
			Boolean hasTv=false,hasWifi=false;
			if(Tv.equals("yes")) {
				hasTv=true;
			}
			if(Wifi.equals("yes")) {
				hasWifi=true;
			}
			DeluxeRoom d=new DeluxeRoom(hotelName,numberOfSqFeet,hasTv,hasWifi);
			int rate=d.getRatePerSqFeet();
			int tariff=d.CalculateTariff(rate);
			System.out.println("Room Tariff per day is:"+tariff);
		}
		else if(ch==2) {
			System.out.println("Hotel Name:");
			String hotelName=scan.next();
			System.out.println("Room Square Feet Area:");
			int numberOfSqFeet=scan.nextInt();
			System.out.println("Room has TV (yes/no):");
			String Tv=scan.next();
			System.out.println("Room has Wifi (yes/no):");
			String Wifi=scan.next();
			Boolean hasTv=false,hasWifi=false;
			if(Tv.equals("yes")) {
				hasTv=true;
			}
			if(Wifi.equals("yes")) {
				hasWifi=true;
			}
			DeluxeACRoom d=new DeluxeACRoom(hotelName,numberOfSqFeet,hasTv,hasWifi);
			int rate=d.getRatePerSqFeet();
			int tariff=d.CalculateTariff(rate);
			System.out.println("Room Tariff per day is:"+tariff);
		}
		else {
			System.out.println("Hotel Name:");
			String hotelName=scan.next();
			System.out.println("Room Square Feet Area:");
			int numberOfSqFeet=scan.nextInt();
			System.out.println("Room has TV (yes/no):");
			String Tv=scan.next();
			System.out.println("Room has Wifi (yes/no):");
			String Wifi=scan.next();
			Boolean hasTv=false,hasWifi=false;
			if(Tv.equals("yes")) {
				hasTv=true;
			}
			if(Wifi.equals("yes")) {
				hasWifi=true;
			}
			SuiteACRoom d=new SuiteACRoom(hotelName,numberOfSqFeet,hasTv,hasWifi);
			int rate=d.getRatePerSqFeet();
			int tariff=d.CalculateTariff(rate);
			System.out.println("Room Tariff per day is:"+tariff);
		}
		scan.close();

	}

}

import java.util.*;

public class Strings {
	
	public  String first(String Fname) {
		String fl = Fname.substring(0, 1);
		String rl = Fname.substring(1);
		fl = fl.toUpperCase();
		rl=rl.toLowerCase();
		String ans = fl + rl;
		return ans;
		
	}
	public  String Second(String snme) {
		
		return snme.toUpperCase();
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String Firstname,f,s;
		String Secondname;
		System.out.println("Enter first name:");
		Firstname=scan.next();
		System.out.println("Enter Second name:");
		Secondname=scan.next();
		Strings str=new Strings();
		f=str.first(Firstname);
		s=str.Second(Secondname);
		System.out.println(f+"  "+s);
		scan.close();

	}

}

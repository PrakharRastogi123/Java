import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program2 {
	public static void main(String args[]) {
		ArrayList<String> teams=new ArrayList<String>(5);
		teams.add("Sunrisers Hyderabad");
		teams.add("Delhi Capitals");
		teams.add("Royal Challengers Bangalore");
		teams.add("Kolkata Knight Riders");
		teams.add("Mumbai Indians");
		for (String s : teams) {
			System.out.println(s);
		}
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter swap positons");
		int fp=scan.nextInt();
		int sp=scan.nextInt();
		Collections.swap(teams,fp,sp);
		for (String s : teams) {
			System.out.println(s);
		}
	}
}

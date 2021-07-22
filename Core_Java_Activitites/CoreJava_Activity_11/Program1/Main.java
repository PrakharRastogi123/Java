import java.util.HashMap;
import java.util.Scanner;

class Bowler{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	Bowler(String name){
		this.name=name;
	}
}
class Wicket{
	String bowlerName;
	String pname[];
	
	public String getBowlerName() {
		return bowlerName;
	}

	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}

	public String[] getPname() {
		return pname;
	}

	public void setPname(String[] pname) {
		this.pname = pname;
	}
	public void display() {
		System.out.println("Player name :"+this.bowlerName);
		System.out.println("Wickets :");
		for(int i=0;i<pname.length;i++) {
			System.out.println(pname[i]);
		}
	}
}
public class Main {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		HashMap<String, String[]> map = new HashMap<>();
		String pname,wickets;
		System.out.println("Enter the player name");
		pname=scan.nextLine();
		System.out.println("Enter wickets - seperated by \"|\" symbol.");
		wickets=scan.nextLine();
		String arr[]=wickets.split("\\|",0);
		map.put(pname, arr);
		while(true) {
			System.out.println("Do you want to add another player (yes/no)");
			String ch=scan.nextLine();
			if(ch.equals("yes")) {
				System.out.println("Enter the player name");
				pname=scan.nextLine();
				System.out.println("Enter wickets - seperated by \"|\" symbol.");
				wickets=scan.nextLine();
				String brr[]=wickets.split("\\|",0);
				map.put(pname, brr);
			}
			else {
				break;
			}
		}
		System.out.println("Enter the player name to search");
		String ps=scan.nextLine();
		if(map.containsKey(ps)) {
			Wicket p=new Wicket();
			p.setBowlerName(ps);
			p.setPname(map.get(ps));
			p.display();
		}
		else {
			System.out.println("No player found with the name "+ps);
		}
		while(true) {
			System.out.println("Do you want to search another player (yes/no)");
			String ch=scan.nextLine();
			if(ch.equals("yes")) {
				System.out.println("Enter the player name to search");
				String ps2=scan.nextLine();
				if(map.containsKey(ps2)) {
					Wicket p1=new Wicket();
					p1.setBowlerName(ps2);
					p1.setPname(map.get(ps2));
					p1.display();
				}
				else {
					System.out.println("No player found with the name "+ps2);
				}
			}
			else {
				break;
			}
		}
		
	}

}

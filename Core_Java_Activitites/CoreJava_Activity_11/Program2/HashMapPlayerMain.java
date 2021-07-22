import java.util.HashMap;
import java.util.Scanner;

class Player{
	String bowlerName;
	int wicketCount;
	public String getBowlerName() {
		return bowlerName;
	}
	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}
	public int getWicketCount() {
		return wicketCount;
	}
	public void setWicketCount(int wicketCount) {
		this.wicketCount = wicketCount;
	}
	Player(String bowlerName,int wicketCount){
		this.bowlerName=bowlerName;
		this.wicketCount=wicketCount;
	}
	public void display() {
		System.out.println("Player name :"+this.bowlerName);
		System.out.println("Wicket Count :"+this.wicketCount);
	}
	
}
public class HashMapPlayerMain {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		String pname,wickets;
		System.out.println("Enter the player name");
		pname=scan.nextLine();
		System.out.println("Enter wickets - seperated by \"|\" symbol.");
		wickets=scan.nextLine();
		String arr[]=wickets.split("\\|",0);
		map.put(pname, arr.length);
		while(true) {
			System.out.println("Do you want to add another player (yes/no)");
			String ch=scan.nextLine();
			if(ch.equals("yes")) {
				System.out.println("Enter the player name");
				pname=scan.nextLine();
				System.out.println("Enter wickets - seperated by \"|\" symbol.");
				wickets=scan.nextLine();
				String brr[]=wickets.split("\\|",0);
				map.put(pname, brr.length);
			}
			else {
				break;
			}
		}
		System.out.println("Enter the player name to search");
		String ps=scan.nextLine();
		if(map.containsKey(ps)) {
			int w=map.get(ps);
			Player p=new Player(ps,w);
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
					int w2=map.get(ps2);
					Player p1=new Player(ps2,w2);
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

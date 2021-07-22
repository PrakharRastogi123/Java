import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Player{
	private String name,team,skill;
	Player(String name,String team, String skill) {
		this.name=name;
		this.team=team;
		this.skill=skill;
	}
	public String gname() {
		return this.name;
	}
	public String gteam() {
		return this.team;
	}
	public String gskill() {
		return this.skill;
	}
}
public class PlayerDetails {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of players");
		int np=scan.nextInt();
		Player p[]=new Player[np];
		TreeMap<Integer,Player> tree_map=new TreeMap<Integer,Player>();
		for(int i=0;i<np;i++) {
			System.out.println("Enter the details of the player "+(i+1));
			int capnum=scan.nextInt();
			String name,team,skill;
			// Read the leftover new line
			scan.nextLine();
			name=scan.nextLine();
			team=scan.nextLine();
			skill=scan.nextLine();
			p[i]=new Player(name,team,skill);
			tree_map.put(capnum, p[i]);
		}
		System.out.println("Player Details");
		for (Map.Entry<Integer, Player> e: tree_map.entrySet()) {
			System.out.println(e.getKey()+"--"+e.getValue().gname()+"--"+e.getValue().gteam()+"--"+e.getValue().gskill());
		}
	}
}

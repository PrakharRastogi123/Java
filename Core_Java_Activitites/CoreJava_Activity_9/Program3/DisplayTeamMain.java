import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Player{
	private String name;
	Player(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class Team{
	private String name;
	private List<Player> playerList=new ArrayList<Player>();
	
	Team(){
		
	}
	Team(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setpList(List<Player> playerList) {
		this.playerList = playerList;
	}
	
	public void addPlayer(String playername) {
		playerList.add(new Player(playername));
	}
	public List<Player> getPlayerList(){
		return playerList;
	}
	
}
public class DisplayTeamMain {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Set<Team> tname=new TreeSet<>();
		Team t=new Team();
		
		for(int i=0;i<n;i++) {
			String s=scan.next();
			String[] arr=s.split("|",0);
			tname.add(new Team(arr[0]));
			t.addPlayer(arr[1]);
			
			
		}
		
	}
}

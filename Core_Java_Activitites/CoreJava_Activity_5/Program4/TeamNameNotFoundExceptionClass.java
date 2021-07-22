import java.util.Scanner;
class TeamNameNotFoundException extends Exception{  
	TeamNameNotFoundException(String s){  
	  super(s);  
	 }  
} 
public class TeamNameNotFoundExceptionClass {
	public static boolean find(String teams[],String s) {
		for(int i=0;i<teams.length;i++) {
			if(s.equals(teams[i])) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String[] teams=new String[8];
		Scanner scan=new Scanner(System.in);
		teams[0]="Chennai Super Kings";
		teams[1]="Sun Risers Hyderabad";
		teams[2]="Delhi Capitals";
		teams[3]="Kings XI Punjab";
		teams[4]="Kolkata Knight Riders";
		teams[5]="Mumbai Indians";
		teams[6]="Rajasthan Royals";
		teams[7]="Royal Challengers Bangalore";
		try {
			System.out.println("Enter the expected winner team of IPL Season 13");
			String winner=scan.nextLine();
			if(!find(teams,winner)) {
				throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 13");
			}
			System.out.println("Enter the expected runner Team of IPL Season 13");
			String runner=scan.nextLine();
			if(!find(teams,runner)) {
				throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 13");
			}
			System.out.println("Expected IPL Season 13 winner:"+winner);
			System.out.println("Expected IPL Season 13 runner:"+runner);
			
		}
		catch(TeamNameNotFoundException ex) {
			 System.out.println(ex);
		}
	
		
	}
}

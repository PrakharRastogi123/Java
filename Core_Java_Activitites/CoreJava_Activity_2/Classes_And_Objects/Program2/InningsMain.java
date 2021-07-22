import java.util.*;
class Innings{
	private String teamsname;
	private String inningsname;
	private int runs;
	public void getter() {
	      System.out.println("Name:"+this.teamsname);
	      System.out.println("Scored:"+this.runs);
	      if(this.inningsname.equals("First")) {
	    	  System.out.println("Need "+(this.runs+1)+" to win");
	      }
	      else {
	    	  System.out.println("Match Ended.");  
	      }
	      
	}

     public void setter(String teamsname,String inningsname,int runs) {
	      this.teamsname=teamsname;
	      this.inningsname=inningsname;
	      this.runs=runs;
	 }
}

public class InningsMain {
	
	public static void main(String[] args)
	{
		String teamsname,inningsname;
		int runs;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the team name:");
		teamsname=scan.next();
		System.out.println("Enter Session:");
		inningsname=scan.next();
		System.out.println("Enter Runs:");
		runs=scan.nextInt();
		Innings i=new Innings();
		i.setter(teamsname,inningsname,runs);
		i.getter();
		
		
	}
}

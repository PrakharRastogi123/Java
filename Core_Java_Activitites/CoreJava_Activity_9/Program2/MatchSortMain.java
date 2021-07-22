import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Match implements Comparable<Match>{
	String matchDate,teamOne,teamTwo;
	
	Match(String matchDate,String teamOne,String teamTwo){
		this.matchDate=matchDate;
		this.teamOne=teamOne;
		this.teamTwo=teamTwo;
	}

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	public String getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}

	public String getTeamTwo() {
		return teamTwo;
	}

	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	
	@Override
	public int compareTo(Match o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class MatchSortMain {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of matches");
		int nmatch=sc.nextInt();
		List<Match> matches = new ArrayList<Match>();
		for(int i=0;i<nmatch;i++) {
			String matchDate,teamOne,teamTwo;
			System.out.println("Enter match date in (MM-dd-yyyy)");
			matchDate=sc.next();
			System.out.println("Enter Team 1");
			teamOne=sc.next();
			System.out.println("Enter Team 2");
			teamTwo=sc.next();
			Match ob=new Match(matchDate,teamOne,teamTwo);
			matches.add(ob);
		}
		System.out.println("Match Details");
		Collections.sort(matches, new Comparator<Match>() {
			public int compare(Match m1, Match m2) {
	            return m2.matchDate.compareTo(m1.getMatchDate());
	        }
		});
		for(int i=0;i<nmatch;i++) {
			Match o=matches.get(i);
			System.out.println("Team 1 "+o.teamOne);
			System.out.println("Team 2 "+o.teamTwo);
			System.out.println("Match held on "+o.matchDate);
		}
	}

}

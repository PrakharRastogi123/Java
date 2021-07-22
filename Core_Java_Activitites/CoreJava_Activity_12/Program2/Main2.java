import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main2 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		String matchType, scores;
		
		System.out.println("Enter the match");
		matchType = sc.nextLine();
		System.out.println("Enter the scores");
		scores = sc.nextLine();
		CalculateScore c1 = new CalculateScore(matchType, scores);
		c1.setscores();
		Thread t1 = new Thread(c1);
		
		System.out.println("Enter the match");
		matchType = sc.nextLine();
		System.out.println("Enter the scores");
		scores = sc.nextLine();
		CalculateScore c2 = new CalculateScore(matchType, scores);
		c2.setscores();
		Thread t2 = new Thread(c2);
		
		System.out.println("Enter the match");
		matchType = sc.nextLine();
		System.out.println("Enter the scores");
		scores = sc.nextLine();
		CalculateScore c3 = new CalculateScore(matchType, scores);
		c3.setscores();
		Thread t3 = new Thread(c3);
		
		System.out.println("Match Summarya");
		t1.start();
		t1.join();
		System.out.println("Match:" +c1.getMatchType());
		System.out.println("Mean: " +c1.getMeanScore());
		System.out.println("Min Score: " +c1.getMinScore());
		System.out.println("Max Score: " +c1.getMaxScore());
		
		t2.start();
		t2.join();
		System.out.println("Match:" +c2.getMatchType());
		System.out.println("Mean: " +c2.getMeanScore());
		System.out.println("Min Score: " +c2.getMinScore());
		System.out.println("Max Score: " +c2.getMaxScore());
		
		t3.start();
		t3.join();
		System.out.println("Match:" +c3.getMatchType());
		System.out.println("Mean:" +c3.getMeanScore());
		System.out.println("Min Score: " +c3.getMinScore());
		System.out.println("Max Score: " +c3.getMaxScore());
		
		}
}
 
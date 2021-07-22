import java.util.ArrayList;

public class Score extends Thread {
	int start;
	int end;
	String scoreType;
	
	ArrayList<Integer> scoreList = new ArrayList<>();
	int x=0;
	public Score(int start, int end, String scoreType) {
		super();
		this.start = start;
		this.end = end;
		this.scoreType = scoreType;
	}
	
	public void run() {
		
		for(int i=start;i<=end;i++)
		{
			if(scoreType=="ODD") {
				
				if(i%2 != 0) {
					scoreList.add(i);
				}
				
			}
			else if(scoreType=="EVEN")
			{
				
				if(i%2 == 0) {
					scoreList.add(i);
				}
				
			}
			
		}
		
		this.display();
		
		}
	public void display() {
		System.out.println(scoreType+ " Scores in given range");
		for(int i=0;i<scoreList.size();i++)
			System.out.println(scoreList.get(i) + " ");
		
		
	}
}


import java.util.Arrays;

class SortScore extends Thread
{
	private String matchType,scoreString;
	private int[] scores;
	SortScore(String matchType,String scoreString)
	{
		this.matchType=matchType;
		this.scoreString=scoreString;
	}
	public void run()
	{
		Arrays.sort(scores);
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	public int[]getscore()
	{
		return scores;
	}
}
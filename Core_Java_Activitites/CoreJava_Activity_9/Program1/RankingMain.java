import java.util.*;

class Ranking implements Comparable<Ranking> {

	 String name;
	 int score;
	public Ranking(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return name + "    " + score ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	


	@Override
	public int compareTo(Ranking i) {
		if(score==i.score)  
			return 0;  
			else if(score<i.score)  
			return 1;  
			else  
			return -1;  
	}
}




public class RankingMain {
	public static void main(String [] args) {
		int n;
		System.out.println("Enter number of players:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		String name[]=new String[n];
		int[] score=new int[10];
		ArrayList<Ranking> al=new ArrayList<Ranking>();
		for(int i=0,j=1;i<n;i++,j++)
		{
		System.out.println("Enter the name of Player "+j+" :");
		name[i]=sc.next();
		System.out.println("Enter the score of Player "+j+" :");
		score[i]=sc.nextInt();
		al.add(new Ranking(name[i],score[i]));
	    }
		Collections.sort(al);
		System.out.println("Player Details by score high to low");
		for (Ranking p : al) {
            System.out.println(p.name + " "
                               + p.score );
        }
		sc.close();
		}

	}	



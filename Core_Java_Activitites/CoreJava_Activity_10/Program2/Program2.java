import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class team {
	String name;
	long numberofmatches;
	public team(String name, long numberofmatches) {
		super();
		this.name = name;
		this.numberofmatches = numberofmatches;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumberofmatches() {
		return numberofmatches;
	}
	public void setNumberofmatches(long numberofmatches) {
		this.numberofmatches = numberofmatches;
	}
}

//creates the comparator for comparing stock value
class TeamComparator implements Comparator<team> {

 // override the compare() method
 public int compare(team s1, team s2)
 {
     if (s1.numberofmatches == s2.numberofmatches)
         return 0;
     else if (s1.numberofmatches > s2.numberofmatches)
         return 1;
     else
         return -1;
 }
}
public class Program2 {
	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);    
	     BufferedReader br=new BufferedReader(r);  
	     ArrayList<team> s=new ArrayList<team>();
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter Number of teams:");
	     int n=sc.nextInt();
	     String[] name=new String[n];
	     long[] no=new long[n];
	     
         for(int i=0,j=1;i<n;i++,j++)
         {
        	 System.out.println("Enter team "+j+" Detail:");
        	 System.out.println("Enter Name:");
        	 name[i]=br.readLine();
        	 System.out.println("Enter Number of matches played:");
        	 no[i]=sc.nextLong();
        	 s.add(new team(name[i], no[i]));
        	
         }
         System.out.println("Team List after sorting by number of matches played:");
  
       
        Collections.sort(s, new TeamComparator());
        for (team t : s) {
            System.out.println(t.name + " -- " + t.numberofmatches
                               );
        }
        sc.close();
    }
}

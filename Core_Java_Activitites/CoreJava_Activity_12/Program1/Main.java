import java.util.*;
public class Main 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String match = null,scores= null;
		ArrayList<SortScore> la=new ArrayList<>();
		for(int i=0;i<3;i++)
		{
			int al[]=new int[5];
			System.out.println("Enter the Match :");
			match=sc.nextLine();
			System.out.println("Enter the Scores :");
			scores=sc.nextLine();
			SortScore temp=new SortScore(match,scores);
			la.add(temp);
			String arr[]=scores.split(",");
			for(int j=0;j<arr.length;j++) al[j]=Integer.parseInt(arr[j]);
			temp.setScores(al);
		}
		System.out.println("Ordered Score List :");
		for(int i=0;i<la.size();i++)
		{
			la.get(i).start();
			try
			{
				la.get(i).join();
			}
			catch(Exception e)
			{
				System.out.print(e);
			}
			int arr[]=la.get(i).getscore();
			System.out.println("Match: "+match);
			for(int j:arr) System.out.println(j);
		}
			sc.close();
	}
}

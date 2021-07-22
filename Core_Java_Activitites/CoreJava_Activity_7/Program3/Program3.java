import java.util.ArrayList;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		ArrayList<String> a2=new ArrayList<String>();
		String players1[] = new String[5];
		String players2[]= new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the top 5 scorers of IPL season 13:");
		for(int i=0;i<5;i++)
		{
			players1[i]=sc.nextLine();
			a1.add(players1[i]);
		}
		System.out.println("Enter the top 5 scorers of IPL season 12:");
		for(int i=0;i<5;i++)
		{
			players2[i]=sc.nextLine();
			a2.add(players1[i]);
		}
		a2.retainAll(a1);
		System.out.println("Consistent run scorers:");
		for(int i=0;i<a2.size();i++)
		{
			System.out.println(a2.get(i));
		}
        sc.close();

	}

}

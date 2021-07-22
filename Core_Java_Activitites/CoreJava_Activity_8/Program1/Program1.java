import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		 System.out.println("Enter Number of Players:");
		 int n;
		 Scanner sc=new Scanner(System.in);
		 InputStreamReader r=new InputStreamReader(System.in);    
		    BufferedReader br=new BufferedReader(r);       
		 n=sc.nextInt();
		 String s[]=new String[n];
		 System.out.println("Enter Name of Players:");
		 for(int i=0;i<n;i++) {
			 try {
				s[i]=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 h.add(s[i]);
		 }
		 System.out.println(h.size());
        sc.close();
	}

}

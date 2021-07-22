import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Program2 {
	public static void main(String[] args) {
	
		 Set<String> ts1 = new TreeSet<>();
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
			 ts1.add(s[i]);
		 }
		 for (String value : ts1)
	            System.out.print(value+"\n" );
		 sc.close();
	}
}

import java.util.ArrayList;
import java.util.Scanner;

public class Program4 {
	public static void main(String args[]) {
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			ArrayList<Integer> runs=new ArrayList<Integer>();
			int c=0,f=0;
			for(int i=0;i<n;i++) {
				int x=scan.nextInt();
				runs.add(x);
				if(x>=100) {
					c++;
					continue;
				}
				if(x>=50) {
					f++;
				}
			}
			System.out.printf("%d\n%d", f,c);
			
	}
}

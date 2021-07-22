import java.util.*;
public class Strings2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String Play1;
		String Play2,fn,sn;
		System.out.println("Enter first Player name:");
		Play1=scan.nextLine();
		System.out.println("Enter Second Player name:");
		Play2=scan.nextLine();
		String[] p1=Play1.split("\\s");
		String[] p2=Play2.split("\\s");
		fn=p1[1];
		sn=p2[1];
		if(fn.equals(sn))
			System.out.println("Yes");
		else
		    System.out.println("No");
		scan.close();

	}

}
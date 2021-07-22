import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range of score:");
		int start=sc.nextInt();
		int end=sc.nextInt();
		Score s1=new Score(start,end,"ODD");
		
		Thread t1=new Thread(s1);
		t1.start();
		t1.join();
		Score s2=new Score(start,end,"EVEN");
		Thread t2=new Thread(s2);
		t2.start();
		t2.join();

	}

}

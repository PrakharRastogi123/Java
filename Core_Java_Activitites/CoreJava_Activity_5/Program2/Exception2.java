import java.util.Scanner;

public class Exception2 {
	public static void main(String[] args) {
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the number of overs");
			int numberOfovers=scan.nextInt();
			if(numberOfovers<0) {
				throw new NegativeArraySizeException();
			}
			int runs[]=new int[numberOfovers];
			System.out.println("Enter the number of runs for each over");
			for(int i=0;i<numberOfovers;i++) {
				runs[i]=scan.nextInt();
			}
			System.out.println("Enter the over number");
			int overnum=scan.nextInt();
			if(overnum>numberOfovers) {
				throw new ArrayIndexOutOfBoundsException();
			}
			System.out.println("Runs scored in this over : "+runs[overnum-1]);
		}
		catch (NegativeArraySizeException ex) {
		    System.out.println(ex);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}
		
	}
}

import java.util.Scanner;

public class Program3 {
   public static void main(String[] args) {
	   String pname;
	   int page;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Player Name:");
	   pname=sc.nextLine();
	   System.out.println("Enter Player Age:");
	   page=sc.nextInt();
	   try {
		 if(page<18) {
			 throw new InvalidAgeRange();
		 }
		 else
		 {
			 System.out.println("Player Name:"+pname);
			 System.out.println("Player Age:"+page);
		 }
	   }
	   catch(Exception e ) {
		  
	   }
   }
}




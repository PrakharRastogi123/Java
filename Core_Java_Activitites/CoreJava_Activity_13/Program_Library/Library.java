import java.time.LocalDate;
import java.util.Scanner;

class Issue{
	String bookname;
	String UserType;
	LocalDate Issuedate;
	Issue(String bookname, String UserType,LocalDate Issuedate){
		this.bookname=bookname;
		this.UserType=UserType;
		this.Issuedate=Issuedate;
	}
}

public class Library {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		LocalDate ld=LocalDate.now();
		System.out.println("Book Name:");
		String bn=sc.nextLine();
		System.out.println("User Type-(Student/Faculty):");
		String ut=sc.nextLine();
		System.out.println("Issue Date: "+ ld);
		System.out.println("Your return date will be:");
		if(ut.equals("Student")) {
			Issue i=new Issue(bn,ut,ld.plusDays(15));
			System.out.print(i.Issuedate);
		}
		else if(ut.equals("Faculty")) {
			Issue i=new Issue(bn,ut,ld.plusDays(90));
			System.out.print(i.Issuedate);
		}
		else {
			System.out.println("Invalid Input!");
		}
	}
}

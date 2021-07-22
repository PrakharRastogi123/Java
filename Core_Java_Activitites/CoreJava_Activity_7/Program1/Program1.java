import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {
  public static void main(String args[]) {
	  String name,country,skill;
	  int age,pos1,pos2;
	  ArrayList al=new ArrayList();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Player Details ");
	  
	  System.out.println("Enter Player Name:  ");
	  name=sc.next();
	  System.out.println("Enter Player Age:  ");
	  age=sc.nextInt();
	  System.out.println("Enter Player Country:  ");
	  country=sc.next();
	  al.add(name);
	  al.add(age);
	  al.add(country);
	  System.out.println("Player Details:  ");
	  for (int i=0;i<al.size();i++) {
		  System.out.println(al.get(i));
	  }
	  
	  System.out.println("Enter Skill :  ");
	  skill=sc.next();
	  System.out.println("Enter position to add skill:  ");
	  pos1=sc.nextInt();
	  al.add(pos1,skill);
	  System.out.println("Player Details:  ");
	  for (int i=0;i<al.size();i++) {
		  System.out.println(al.get(i));
	  }
	  System.out.println("Enter position of detail to be removed:  ");
	  pos2=sc.nextInt();
	  al.remove(pos2);
	  System.out.println("Player Details:  ");
	  for (int i=0;i<al.size();i++) {
		  System.out.println(al.get(i));
	  }
	  sc.close();
  }
}

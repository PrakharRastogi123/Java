
import java.util.Scanner;

public class Program1 {
	
		   

		public static void main (String args[]) {
		    int runs;
			int overs;
			float result =  0;
		    Scanner sc=new Scanner(System.in);
		      
		    try{
		    	  System.out.println("Enter Total runs Scored :");
			      runs=Integer.parseInt(sc.next());
			     
			      System.out.println("Enter total overs faced :");
			      overs=Integer.parseInt(sc.next());
			     
			      if(overs!=0)
			      {
		           result = (float) runs/overs;
		           System.out.printf("The current runrate is : %.2f" ,result);
			      }
			      else
			      {
			    	 result=runs/overs; 
			      }
		     } 
		    
		    catch (ArithmeticException e) {
		         System.out.println ( e);
		      }
		 
	        catch (NumberFormatException e) {
	              System.out.println( e);
	          }
		    sc.close();
		     
		}
}

import java.io.*;
import java.util.*;
public class GreaterId{
	 	static ArrayList<Integer> Cricketer=new ArrayList<Integer>();
	    void findCricketerId(int arrid[],int arrscore[], int size, int score){
	 		
        	for(int i=0;i<=size;i++){
				//System.out.println(arrscore[i]+" "+reqd_score);
            	if(arrscore[i]>score){
                	Cricketer.add(arrid[i]);
            	}
        	}
        	if(Cricketer.size()<=0){
            	System.out.print("Invalid array size");
            	System.exit(0);
        	}
        	for(int i=0;i<Cricketer.size();i++){
            	System.out.println(Cricketer.get(i));
        	}
	 	}
     public static void main(String []args){
        Scanner scan=new Scanner(System.in);
		System.out.print("Enter Input Number:");
        int n=scan.nextInt();
        int flag=0;
        if(n<0){
            flag=1;
        }
        int arrid[]=new int[n];
        int arrscore[]=new int[n];
        int j=0;
		n=n-1;
		n=n/2;
		int t=n;
        while(t>=0){
			
            int id=scan.nextInt();
            int score=scan.nextInt();
            if(id<0 || score<0){
                flag=1;
            }
            arrid[j]=id;
            arrscore[j]=score;
			j++;
			t--;
        }
		if(flag==1){
            System.out.print("Invalid Input");
            System.exit(0);
        }
        System.out.print("Enter Input Score:");
        int reqd_score=scan.nextInt();
        if(reqd_score<0){
            System.out.print("Invalid score");
            System.exit(0);
        }
        GreaterId o=new GreaterId();
        o.findCricketerId(arrid,arrscore,n,reqd_score);
     }
}
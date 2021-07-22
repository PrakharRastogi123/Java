import java.util.Scanner;
public class Count
{
   public  int findelementcount(int n,int a[],int x)
       {
           int  count = 0, i = 0;
           for(i = 0; i < n; i++)
          {
               if(a[i] == x)
               {
                  count++;
                   
               }
           }
         return count;
       }

 
   public static void main(String[] args)
    {
       int n, x, count = 0, i = 0,f=0,sol;
       Count o=new Count();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        if(n<1)
       {
        System.out.println("INVALID INPUT");
        System.exit(0);
        }
        int a[] = new int[n];
         System.out.println("Enter the elements of array:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
         for(i = 0; i < n; i++)
        {
            if(a[i] <0)
             {
               System.out.println("INVALID INPUT");
               System.exit(0);
               }
        }
        System.out.print("Enter the element of which you want to count number of occurrences:");
        x = s.nextInt();
      sol=o.findelementcount(n,a,x);
        if(sol>0)
        System.out.print("Occurrence of a number is :"+sol);
        else
         System.out.print("INVALID INPUT");
   }
}


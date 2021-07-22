import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class MallParking {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("------------------PARKING MANAGEMENT SYSTEM--------------------\nEnter your choice\n1.Four Wheeler\n2.Two Wheeler");
int ch=sc.nextInt();
System.out.println("Enter Vehicle Number:");
String number=sc.next();
System.out.println("Enter Entry Time:(hh:mm:ss )");
String t1=sc.next();
LocalTime entry=LocalTime.parse(t1);
System.out.println("Enter Exit Time:(hh:mm:ss )");
String t2=sc.next();
LocalTime exit=LocalTime.parse(t2);

long d= entry.until(exit, ChronoUnit.HOURS);
if(ch==1) {
System.out.println("Enter Vehicle Number:" + number);
System.out.println("Total time parked: " + d);
System.out.println("Cost of parking:" + (d*10));

}
else if(ch==2) {
System.out.println("Enter Vehicle Number:" + number);
System.out.println("Total time parked: " + d);
System.out.println("Cost of parking:" + (d*5));
}
}

}



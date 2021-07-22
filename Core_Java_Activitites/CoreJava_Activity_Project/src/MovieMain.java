import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.List;
import java.util.Scanner;

import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("--------MOVIE MANAGEMENT AND PRODUCTION MANAGEMENT---------");
		System.out.println("\n--------MOVIE MANAGEMENT---------\n");
		System.out.println("1.INSERT A MOVIE\n2.VIEW ALL MOVIE DETAILS\n3.DELETE A MOVIE\n4.UPDATE A MOVIE\n5.GET MOVIE DETAILS BY MOVIEID\n6.ENTER INTO PRODUCTION MANAGEMENT\nEnter Your Choice:");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:     System.out.println("Enter MovieID:");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Movie name:");
					String name=sc.nextLine();
					System.out.println("Enter Hero Name:");
					String hero=sc.nextLine();
					System.out.println("Enter Heroine name:");
					String heroine=sc.nextLine();
					System.out.println("Enter Releasedate:");
					System.out.println("Enter Year:");
					String yyyy=sc.nextLine();
					System.out.println("Enter Month:(mm)");
					String mm=sc.nextLine();
					System.out.println("Enter Day:(dd)");
					String dd=sc.nextLine();
					String date=yyyy+"-"+mm+"-"+dd;
					 DateTimeFormatter f = new DateTimeFormatterBuilder().parseCaseInsensitive()
					            .append(DateTimeFormatter.ofPattern("yyyy-MM-dd")).toFormatter();
					 LocalDate date1 = LocalDate.parse(date, f);
					System.out.println("Enter Movie Language:");
					String lang=sc.nextLine();
					System.out.println("Enter Movie Length:");
					int length=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Movie Type:");
					String type=sc.nextLine();
					System.out.println("Enter Production ID:");
					int pid=sc.nextInt();
					Movie m=new Movie(id,name,hero,heroine,date1,lang,length,type,pid);
				    MovieDao md=new MovieDao();
				    md.insertmovie(m);
				    break;
		case 2:     MovieDao md1=new MovieDao();
			        md1.getAllMovie();
	                
	                break;
		case 3:     MovieDao md3=new MovieDao();
		            System.out.println("Enter MovieID of movie to be deleted:");
		            int i=sc.nextInt();
		            boolean b=md3.deleteMovie(i); break;
		case 4:     System.out.println("Enter MovieID of movie to be updated:");
					int id1=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Movie name to be updated :");
					String name1=sc.nextLine();
					System.out.println("Enter Hero Name to be updated :");
					String hero1=sc.nextLine();
					System.out.println("Enter Heroine name to be updated:");
					String heroine1=sc.nextLine();
					System.out.println("Enter Releasedate to be updated:");
					System.out.println("Enter Year:");
					String y=sc.nextLine();
					System.out.println("Enter Month:(mm)");
					String m1=sc.nextLine();
					System.out.println("Enter Day:(dd)");
					String d=sc.nextLine();
					String date2=y+"-"+m1+"-"+d;
					 DateTimeFormatter f1 = new DateTimeFormatterBuilder().parseCaseInsensitive()
					            .append(DateTimeFormatter.ofPattern("yyyy-MM-dd")).toFormatter();
					 LocalDate date3 = LocalDate.parse(date2, f1);
					System.out.println("Enter Movie Language to be updated:");
					String lang1=sc.nextLine();
					System.out.println("Enter Movie Length to be updated:");
					int length1=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Movie Type to be updated:");
					String type1=sc.nextLine();
					System.out.println("Enter Production ID to be updated:");
					int pid1=sc.nextInt();
					Movie m2=new Movie(id1,name1,hero1,heroine1,date3,lang1,length1,type1,pid1);
				    MovieDao md2=new MovieDao();
				    md2.updateMovie(m2); break;
		case 5:     System.out.println("Enter MovieID of movie to be viewed:");
					int id3=sc.nextInt();
					 MovieDao md4=new MovieDao();
					 md4.getMovieById(id3); break;
					 
		case 6:		System.out.println("1.INSERT A PRODUCTION\n2.VIEW ALL PRODUCTIONS DETAILS\n3.DELETE A PRODUCTION\n4.UPDATE A PRODUCTION\n5.GET PRODUCTION DETAILS BY PRODUCTIONID\nEnter Your Choice:");
					int ch2=sc.nextInt();
					switch(ch2) {
					case 1:     System.out.println("Enter Production ID:");
								int id2=sc.nextInt();
								sc.nextLine();
								System.out.println("Enter Production name:");
								String name2=sc.nextLine();
								System.out.println("Enter Address:");
								String Addr=sc.nextLine();
								System.out.println("Enter Date Of Started:");
								String dos=sc.nextLine();
								System.out.println("Enter Ownername:");
								String ownname=sc.nextLine();
								Productions p=new Productions(id2,name2,Addr,dos,ownname);
							    ProductionDao pd=new ProductionDao();
							    pd.insertproduction(p);
							    break;
					case 2:     ProductionDao pd1=new ProductionDao();
						        List<Productions> li1=pd1.getAllProduction();
				                for(Productions p1:li1) {
				                	System.out.println(p1);
				                }
				                break;
					case 3:     ProductionDao pd3=new ProductionDao();
					            System.out.println("Enter ProductionID of movie to be deleted:");
					            int i1=sc.nextInt();
					            boolean b1=pd3.deleteProduction(i1); break;
					case 4:     System.out.println("Enter ProductionID of movie to be updated:");
								int id4=sc.nextInt();
								sc.nextLine();
								System.out.println("Enter Production name to be updated :");
								String name3=sc.nextLine();
								System.out.println("Enter Address to be updated :");
								String addr=sc.nextLine();
								System.out.println("Enter Date Of Started to be updated:");
								String dos1=sc.nextLine();
								System.out.println("Enter Ownername to be updated:");
								String ownname1=sc.nextLine();
								Productions p2=new Productions(id4,name3,addr,dos1,ownname1);
							    ProductionDao pd2=new ProductionDao();
							    pd2.updateProduction(p2); break;
					case 5:     System.out.println("Enter Production ID of movie to be viewed:");
								int pid2=sc.nextInt();
								 ProductionDao pd4=new ProductionDao();
								 pd4.getProductionById(pid2); break;
					default :    System.out.println("INVALID CHOICE");break;
					}
					break;
		default :    System.out.println("INVALID CHOICE");break;
		}
	}

}

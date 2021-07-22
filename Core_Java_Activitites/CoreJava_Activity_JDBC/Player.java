package prakhar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Player {

	public static void main(String[] args) throws SQLException {
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/genesis","root","spacemarines");
		System.out.println("connected");
		Statement s=c.createStatement();
		s.execute("insert into players values(1,'virat',10,'9108262295',100,'1999-04-12')");
		s.execute("insert into players values(2,'Dhoni',20,'9108222222',90,'1995-04-12')");
		s.execute("insert into players values(3,'Rohit',30,'9133262295',110,'1989-04-12')");
		s.execute("insert into players values(4,'Yuvi ',40,'9444262295',105,'1998-04-12')");
		s.execute("insert into players values(5,'Padikal',50,'9112342295',200,'2000-04-12')");
		System.out.println("inserted");
		ResultSet rs=s.executeQuery("select * from players");
		
		System.out.println("playerno"+"   "+"PlayerName"+"   "+"DOB");
		System.out.println("-------------------------------");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"        "+rs.getString(2)+"        "+rs.getString(6));
		}
		System.out.println("-------------------------------");
		System.out.println("1.INSERT\n2.DELETE\n3.VIEW\nEnter your choice:");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch) {
		case 1: System.out.println("Enter Player no:");
		int n=sc.nextInt();
		       System.out.println("\nPlayerName:");
		       String name=sc.next();
		       System.out.println("\nPlayer team number:");
		       int n2=sc.nextInt();
		    System.out.println("Contact number:");
		       String ph=sc.next();
		       System.out.println("enter runs:");
		       int n3=sc.nextInt();
		       System.out.println("DOB");
		       String d=sc.next();
		       Statement s1=c.createStatement();
		       s1.execute("insert into players values("+n+",'"+name+"',"+n2+",'"+ph+"',"+n3+",'"+d+"')");
		       System.out.println("Inserted");break;
		case 2: System.out.println("Enter Player Number to delete:");
		       int pn=sc.nextInt();
		       int rs1=s.executeUpdate("delete from players where Playerno="+pn);
		       System.out.println("Number of Records deleted "+rs1);
		       break;
		case 3: ResultSet rs2=s.executeQuery("select * from players");
		        System.out.println("playerno"+"   "+"PlayerName"+"   "+"DOB");
		System.out.println("-------------------------------");
		while(rs2.next()) {
			System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+rs2.getString(6));
		} break;
		       
		}
	}
}
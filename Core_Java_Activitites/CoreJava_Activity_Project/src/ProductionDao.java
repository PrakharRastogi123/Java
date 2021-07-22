package prakhar;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductionDao {
	public boolean insertproduction(Productions p) throws Exception{
		Connection con= MovieConfig.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into productions values(?,?,?,?,?)");
		ps.setInt(1, p.getProductionid());
		ps.setString(2, p.getProductionname());
		ps.setString(3, p.getAddress());
		ps.setString(4, p.getDateofStarted());
		ps.setString(5, p.getOwnername());
		boolean b=ps.execute();
		System.out.println("Inserted ");
		return b;
	}
	public List<Productions> getAllProduction() throws Exception{
		List<Productions> prodns=new ArrayList<Productions>();
		Connection con=MovieConfig.getConnection();
		CallableStatement cs=con.prepareCall("{call disp_prod()}");
		ResultSet rs=cs.executeQuery();
		while(rs.next()) {
			prodns.add(new Productions(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));;
		}
		return prodns;
      }
	
	public boolean updateProduction(Productions p) throws Exception {
		Connection con= MovieConfig.getConnection();
		String query="update productions set Productionid=?,Productionname=?,Address=?,Dateofstarted=?,Ownername=? where Productionid=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, p.getProductionid());
        ps.setString(2, p.getProductionname());
        ps.setString(3, p.getAddress());
        ps.setString(4, p.getDateofStarted());
        ps.setString(5, p.getOwnername());
        ps.setInt(6, p.getProductionid());
		boolean r=ps.execute();
		System.out.println("Production Updated ");
		return r;
	}
	
	public boolean deleteProduction(int productionid) throws Exception {
		Connection con= MovieConfig.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from productions where Productionid="+productionid);
		boolean r=ps.execute();
		System.out.println("Production Deleted ");
		return r;
	}
	
	public void getProductionById(int id) throws Exception {
		Connection c= MovieConfig.getConnection();
		Statement s=c.createStatement();
		ResultSet rs2=s.executeQuery("select * from productions where Productionid="+id);
		                   
		 System.out.println("-------------------------------------------------------------------------------------"
		 		+ "---------------------------------------------");
		 while(rs2.next()) {
		 System.out.println(rs2.getInt(1)+"          "+rs2.getString(2)+"          "+rs2.getString(3)+"          "
		 +rs2.getString(4)+"       "+rs2.getString(5));
		 }
	}

}

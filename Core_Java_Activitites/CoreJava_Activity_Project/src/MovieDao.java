import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MovieDao {
	public boolean insertmovie(Movie m) throws Exception{
		Connection con= MovieConfig.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into movie values(?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, m.getMovieid());
		ps.setString(2, m.getMoviename());
		ps.setString(3, m.getHero());
		ps.setString(4, m.getHeroine());
		ps.setDate(5, m.get_date());
		ps.setString(6, m.getLang());
		ps.setInt(7, m.getLength());
		ps.setString(8, m.getType());
		ps.setInt(9, m.getProdid());
		boolean b=ps.execute();
		System.out.println("Inserted ");
		return b;
	}
	public void getAllMovie() throws Exception{
		Connection con=MovieConfig.getConnection();
		CallableStatement cs=con.prepareCall("{call displaymovie()}");
		ResultSet rs=cs.executeQuery();
		while(rs.next()) {
			System.out.println("Movie ID: "+rs.getInt(1)+"\nMovie Name: "+rs.getString(2)+"\nHero Name: "+rs.getString(3)+"\nHeroine Name: "
					 +rs.getString(4)+"\nReleased Date: "+rs.getString(5)+"\nLanguage: "+rs.getString(6)+"\nLength: "+rs.getInt(7)+"\nMovie Type: "
					 +rs.getString(8)+"\nProfuction ID: "+rs.getInt(9)+"\nProduction Name: "+rs.getString(11)+"\nProduction Address "+rs.getString(12)+"\nDate Of Started: "+rs.getString(13)+"\nProduction Owner Name: "+rs.getString(14)+"\n\n");
		}
		
      }
	
	public boolean updateMovie(Movie m) throws Exception {
		Connection con= MovieConfig.getConnection();
		String query="update movie set Movieid=?,Moviename=?,Heroname=?,Heroine=?,Releaseddate=?,Language=?,Length=?,Movietype=?,Productionid=? where Movieid=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, m.getMovieid());
        ps.setString(2, m.getMoviename());
        ps.setString(3, m.getHero());
        ps.setString(4, m.getHeroine());
        ps.setDate(5, m.get_date());
        ps.setString(6, m.getLang());
        ps.setInt(7, m.getLength());
        ps.setString(8, m.getType());
        ps.setInt(9, m.getProdid());
        ps.setInt(10, m.getMovieid());
		boolean r=ps.execute();
		System.out.println("Movie Updated ");
		return r;
	}
	
	public boolean deleteMovie(int movieid) throws Exception {
		Connection con= MovieConfig.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from movie where Movieid="+movieid);
		boolean r=ps.execute();
		System.out.println("Movie Deleted ");
		return r;
	}
	
	public void getMovieById(int id) throws Exception {
		Connection c= MovieConfig.getConnection();
		Statement s=c.createStatement();
		ResultSet rs2=s.executeQuery("select * from movie,productions where movie.Productionid=productions.Productionid and Movieid="+id);
		
		                   
		 System.out.println("-------------------------------------------------------------------------------------"
		 		+ "---------------------------------------------");
		 while(rs2.next()) {
		 System.out.println("Movie ID: "+rs2.getInt(1)+"\nMovie Name: "+rs2.getString(2)+"\nHero Name: "+rs2.getString(3)+"\nHeroine Name: "
		 +rs2.getString(4)+"\nReleased Date: "+rs2.getString(5)+"\nLanguage: "+rs2.getString(6)+"\nLength: "+rs2.getInt(7)+"\nMovie Type: "
		 +rs2.getString(8)+"\nProfuction ID: "+rs2.getInt(9)+"\nProduction Name: "+rs2.getString(11)+"\nProduction Address "+rs2.getString(12)+"\nDate Of Started: "+rs2.getString(13)+"\nProduction Owner Name: "+rs2.getString(14));
		 }
	}
}

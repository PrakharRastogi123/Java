package prakhar;
import java.sql.Connection;
import java.sql.DriverManager;
public class MovieConfig {
	public static Connection getConnection() throws Exception{
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/gen","root","spacemarines");
		return c;
}
}
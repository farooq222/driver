import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class Testing{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("driver");
		Properties test = new Properties();
		test.put("user", "root");
		test.put("password", "");
		DriverManager.getConnection("jdbc:mysql://localhost:3306", test);
	}

}

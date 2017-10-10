package some.other.store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Repository {
	private Connection connection;
	private PreparedStatement selectStatement;
	private PreparedStatement insertStatement;

	public Repository() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/glarimy?user=root&password=admin");
		selectStatement = connection.prepareStatement("select * from directory where name=?");
		insertStatement = connection.prepareStatement("insert into directory (name, phoneNumber) values (?, ?)");
	}

	public long select(String name) throws Exception {
		selectStatement.setString(1, name);
		ResultSet rs = null;
		try {
			rs = selectStatement.executeQuery();
			if (rs.next())
				return rs.getLong("phonenumber");
			else
				throw new Exception("No contact found!");
		} finally {
			rs.close();
		}
	}

	public void insert(String name, long phoneNumber) throws Exception {
		insertStatement.setString(1, name);
		insertStatement.setLong(2, phoneNumber);
		insertStatement.executeUpdate();
	}

	public void finalize() {
		try {
			selectStatement.close();
			insertStatement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

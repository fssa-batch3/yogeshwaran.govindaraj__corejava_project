package day11.practice;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

import day11.solved.ConnectionUtil;

class Task {
	int id;
	String name;
	String status;
}

class TaskDAO {
	public void createTask(Task task) throws DAOException, SQLException {

		try {
			// Write code here to get connection
			Connection connection = ConnectionUtil.getConnection();

			// Step 02: Create a Statement
			Statement stmt = (Statement) connection.createStatement();

			// Getting the data

			Task one = new Task();
			one.id = 6;
			one.name = "Sample Task";
			one.status = "Pending";

			// Step 04: Execute Insert Query
			String query = "INSERT INTO user (id, name, status) VALUES (" + one.id + ", '" + one.name + "', '"
					+ one.status + "')";
			int rows = ((java.sql.Statement) stmt).executeUpdate(query);
			System.out.println("No of rows inserted :" + rows);

			// Step 04: close the connection resources
			ConnectionUtil.close(connection, (java.sql.Statement) stmt, null);

		} catch (SQLException e) {
			throw new DAOException("Error while creating the task.", e);
		}
	}

}
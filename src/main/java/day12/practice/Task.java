package day12.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import day11.practice.DAOException;

class Task {
	int id;
	String name;
	String status;
}

class TaskDAO {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/project";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "root";

	public void createTask(Task task) throws DAOException {
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
			PreparedStatement Statement = connection
					.prepareStatement("INSERT INTO task (id, name, status) VALUES (?, ?, ?)");
			Statement.setInt(1, task.id);
			Statement.setString(2, task.name);
			Statement.setString(3, task.status);
			Statement.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException("Error creating task: " + e.getMessage());
		}
	}

	public void updateTask(Task task) throws DAOException {
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {

			PreparedStatement statement = connection
					.prepareStatement("UPDATE task SET name = ?, status = ? WHERE id = ?");
			statement.setString(1, task.name);
			statement.setString(2, task.status);
			statement.setInt(3, task.id);
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException("Error updating task: " + e.getMessage());
		}
	}

	public void deleteTask(int taskId) throws DAOException {
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {

			PreparedStatement statement = connection.prepareStatement("DELETE FROM task WHERE id = ?");
			statement.setInt(1, 2);
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException("Error deleting task: " + e.getMessage());
		}
	}

	public List<Task> getAllTasks() throws DAOException {
		List<Task> tasks = new ArrayList<>();
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM task");
			while (resultSet.next()) {
				Task task = new Task();
				task.id = resultSet.getInt("id");
				task.name = resultSet.getString("name");
				task.status = resultSet.getString("status");
				tasks.add(task);
			}
		} catch (SQLException e) {
			throw new DAOException("Error getting all tasks: " + e.getMessage());
		}
		return tasks;
	}
}

package day12.practice;

import java.util.List;

import day11.practice.DAOException;
 
public class MainExecute {

	public static void main(String[] args) throws DAOException {
		TaskDAO taskDAO = new TaskDAO();

		
		Task newTask = new Task();
		newTask.id = 14;
		newTask.name = "Playing in garden";
		newTask.status = "Pending";
		taskDAO.createTask(newTask);

	
		Task existingTask = new Task();
		existingTask.id = 1;
		existingTask.name = "Going to outing";
		existingTask.status = "Waiting";
		taskDAO.updateTask(existingTask);

		
		int taskIdToDelete = 1;
		taskDAO.deleteTask(taskIdToDelete);

	
		try {
			List<Task> allTasks = taskDAO.getAllTasks();
			for (Task task : allTasks) {
				System.out.println("ID: " + task.id + ", Name: " + task.name + ", Status: " + task.status);
			}
		} catch (DAOException e) {
			System.err.println(e.getMessage());
		}
	}

}

package day11.practice;

import day11.practice.DAOException;
import day11.practice.Task;
import day11.practice.TaskDAO;
import org.junit.jupiter.api.Test;

//import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.SQLException;

class TestTaskDAO {
    @Test
    void testCreateTask() {
        TaskDAO taskDAO = new TaskDAO();
        Task task = new Task(4,"Sample Task 3","Pending");

        assertThrows(SQLException.class, () -> taskDAO.createTask(task));
    }
    
    @Test
    void validTestCreateTask() {
        TaskDAO taskDAO = new TaskDAO();
        Task task = new Task(6,"Sample Task 5","Pending");

        try {
            taskDAO.createTask(task);
        } catch (DAOException | SQLException e) {
            e.printStackTrace();
            fail("An exception occurred: " + e.getMessage());
        }
    }

	private void fail(String string) {
		// TODO Auto-generated method stub
		
	}
}

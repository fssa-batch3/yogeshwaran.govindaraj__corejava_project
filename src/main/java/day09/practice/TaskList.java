package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Task implements Comparable<Task> {
    private int id;
    private String name;
    private String deadline;
    public Task(int id, String name, String deadline) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
    }
    public Task(int id2, String name2, LocalDate of) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDeadline() {
        return deadline;
    }
    @Override
    public int compareTo(Task other) {
        return this.deadline.compareTo(other.getDeadline());
    }
}
public class TaskList {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(3, "Coding", "2022-01-22"));
        tasks.add(new Task(5, "Product Design", "2022-10-01"));
        tasks.add(new Task(1, "Software Design", "2022-10-07"));
        tasks.add(new Task(3, "Coding", "2022-10-22"));
        Collections.sort(tasks);
        for (Task task : tasks) {
            System.out.println(task.getId() + "," + task.getName() + "," + task.getDeadline());
        }
    }
}
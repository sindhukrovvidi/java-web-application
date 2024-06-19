package com.sprinboot.webapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList();
	
	private static int todoCount = 0;
	
	static {
		todos.add(new Todo(++todoCount, "sindhu", "Learn Java", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCount, "abhinav", "Learn Java", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCount, "sahithi", "Learn Java", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCount, "sindhu", "Learn Java", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCount, "sindhu", "Learn Java", LocalDate.now().plusYears(1), false));
	}
	
	public List<Todo> findByUsername(String username) {
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate date, boolean done) {
		Todo todo = new Todo(++todoCount, username, description, date, done);
		todos.add(todo);
	}
}

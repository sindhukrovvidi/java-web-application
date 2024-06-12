package com.sprinboot.webapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList();
	
	static {
		todos.add(new Todo(1, "sindhu", "Learn Java", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "abhinav", "Learn Java", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(3, "sahithi", "Learn Java", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(4, "sindhu", "Learn Java", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(5, "sindhu", "Learn Java", LocalDate.now().plusYears(1), false));
	}
	
	public List<Todo> findByUsername(String username) {
		return todos;
	}
}

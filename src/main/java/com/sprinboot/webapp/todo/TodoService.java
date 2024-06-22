package com.sprinboot.webapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

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
		System.out.println("See the id: ");
		System.out.println(todoCount);
		System.out.println("See the id: " + date);
		Todo todo = new Todo(++todoCount, username, description, date, done);
		todos.add(todo);
	}
	
	public void deleteById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}
	
	public Todo findById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		return todos.stream().filter(predicate).findFirst().get();
	}
	
	public void updateTodo(@Valid Todo todo) {
//		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
//		Todo currTodo = todos.stream().filter(predicate).findFirst().get();
		
		deleteById(todo.getId());
		todos.add(todo);
		
	}
}

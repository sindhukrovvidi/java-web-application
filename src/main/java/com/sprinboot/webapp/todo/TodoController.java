package com.sprinboot.webapp.todo;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {
	
	private TodoService todoService;

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping("list-todos")
	public String listTodos(ModelMap model) {
		model.put("todos", todoService.findByUsername("sindhu"));
		return "listTodos";
	}
	
	@RequestMapping(value="add-todo", method = RequestMethod.GET)
	public String showNewTodoPage() {
		return "add-todo";
	}
	
	@RequestMapping(value="add-todo", method = RequestMethod.POST)
	public String addNewTodoPage(@RequestParam String description, ModelMap model) {
		todoService.addTodo((String)model.get("name"), description, LocalDate.now().plusYears(1), false);
		return "redirect:list-todos";
	}
}

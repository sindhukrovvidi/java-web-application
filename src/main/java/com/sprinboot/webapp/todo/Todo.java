package com.sprinboot.webapp.todo;

import java.time.LocalDate;
import jakarta.validation.constraints.Size; 

public class Todo {
	private int id;
	private String username;
	
	@Size(min=10, message="Min char length should be 10")
	private String description;
	
	private LocalDate date;
	private boolean done;
	
	public Todo(int id, String username, String description, LocalDate date, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.date = date;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", targetDate="
				+ date + ", done=" + done + "]";
	}
	
	
}

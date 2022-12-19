package practice;

import java.time.LocalDate;

public class Task{
	public String task;
	public LocalDate day;
	
	public  Task( LocalDate day, String task) {
		this.task =task;
		this.day = day;
	}
	public LocalDate getDay() {
		return day;
	}
	public String getTask() {
		return task;
	}

}

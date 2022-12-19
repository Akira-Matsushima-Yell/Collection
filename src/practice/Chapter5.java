package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chapter5 {
	public static void main(String[] args) {
		List<Task> map1 = new ArrayList<>();

		map1.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う。"));
		map1.add(new Task(LocalDate.of(2021, 9, 15), "○○社面談。"));
		map1.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う。"));
		map1.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く。")); 
		map1.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く。"));

		Collections.sort(map1, new Comparator<Task>() {
			@Override
			public int compare(Task t1, Task t2) {
				return t1.getDay().compareTo(t2.getDay());
			}
		});

		for (Task task1 : map1) {
			System.out.println(task1.getDay() + ":" + task1.getTask());
		}

	}

}

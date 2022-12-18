package practice;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Chapter5 {
	public static LinkedHashMap<LocalDate, String> sortMapByKey(Map<LocalDate, String> map) {
		List<Map.Entry<LocalDate, String>> entries = new LinkedList<>(map.entrySet());
		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

		LinkedHashMap<LocalDate, String> result = new LinkedHashMap<>();
		for (Map.Entry<LocalDate, String> entry : entries) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}

	public static void main(String[] args) {
		Map<LocalDate, String> map1 = new LinkedHashMap<>();
		map1.put(LocalDate.of(2021, 10, 21), "牛乳を買う");
		map1.put(LocalDate.of(2021, 9, 15), "○○社面談");
		map1.put(LocalDate.of(2021, 12, 4), "手帳を買う");
		map1.put(LocalDate.of(2021, 8, 10), "散髪に行く");
		map1.put(LocalDate.of(2021, 11, 9), "スクールの課題を解く");

		Map<LocalDate, String> result = sortMapByKey(map1);
		for (Map.Entry<LocalDate, String> entry : result.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}

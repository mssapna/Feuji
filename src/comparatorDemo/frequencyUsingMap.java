package comparatorDemo;

import java.util.HashMap;
import java.util.Map;

public class frequencyUsingMap {
	void add() {
		Map<Character, Integer> map = new HashMap<>();
		String s1 = "corenutsc";
		char[] ch = s1.toCharArray();
		for (Character character : ch) {
			if (map.containsKey(character)) {
				map.put(character, map.get(character) + 1);
			} else {
				map.put(character, 1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		frequencyUsingMap frequencyUsingMap = new frequencyUsingMap();
		frequencyUsingMap.add();
	}

}

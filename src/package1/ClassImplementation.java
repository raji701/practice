package package1;

import java.util.HashMap;
import java.util.Map;

public class ClassImplementation {

	// added by madhu
	// Main function

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 1, 2, 3, 1, 2, 1 };

		//Map 
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		for (int num : array) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			System.out.println("Number: " + entry.getKey() + ", Frequency: " + entry.getValue());
		}
	}
}

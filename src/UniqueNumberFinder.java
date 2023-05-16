import java.util.*;

public class UniqueNumberFinder {
    public static List<Integer> findUniqueNumbers(List<Integer> input) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each number in the input collection
        for (int number : input) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        List<Integer> uniqueNumbers = new ArrayList<>();

        // Find numbers with frequency equal to 1
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueNumbers.add(entry.getKey());
            }
        }

        return uniqueNumbers;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 1, 3);
        List<Integer> uniqueNumbers = findUniqueNumbers(input);
        System.out.println(uniqueNumbers);  // Output: [2, 3]
    }
}
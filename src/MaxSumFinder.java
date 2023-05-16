import java.util.List;

public class MaxSumFinder {
    public static int findMaxSum(List<Integer> numbers) {
        if (numbers == null || numbers.size() < 2) {
            throw new IllegalArgumentException("List must contain at least two numbers");
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                int sum = numbers.get(i) + numbers.get(j);
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 9, 7, 11);
        int maxSum = findMaxSum(numbers);
        System.out.println(maxSum);  // Output: 20
    }
}
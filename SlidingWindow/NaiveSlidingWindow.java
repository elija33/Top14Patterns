package SlidingWindow;

//Example: Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ 
//consecutive elements in the array.

public class NaiveSlidingWindow {
    public static int number(int numbers[], int target) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i + target - 1 < numbers.length; i++) {
            int sum = 0;

            for (int j = 0; j < target; j++) {
                sum += numbers[i + j];
            }

            max_sum = Math.max(max_sum, sum);
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int number[] = { 1, 8, 30, -5, 20, 7 };
        int target = 3;
        System.out.println(number(number, target));
    }
}
package SlidingWindow;

public class EfficientSlidingWindow {
    public static int maxSum(int number[], int target) {
        int curr_sum = 0;

        for (int i = 0; i < target; i++)
            curr_sum += number[i];

        int max_sum = curr_sum;

        for (int i = target; i < number.length; i++) {
            curr_sum += (number[i] - number[i - target]);

            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int number[] = { 1, 8, 30, -5, 20, 7 };
        int target = 3;
        System.out.println(maxSum(number, target));
    }
}

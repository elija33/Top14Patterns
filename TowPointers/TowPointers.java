package TowPointers;

import java.util.Arrays;

public class TowPointers {
    public static int[] towpointer(int number[], int givenumber) {

        // Sort Up all the Element in the Array
        Arrays.sort(number);

        // the beginning of the array
        int left = 0;
        // The right of the array
        int right = number.length - 1;

        while (left < right) {

            // cheeck if the start array and the right array add up to our given number
            if (number[left] + number[right] == givenumber) {

                // retrun true if they add up to our givennumber
                return new int[] { number[left], number[right] };
            }

            // if they do not add up to our given number, we start decrements the right to
            // find out if they add up
            else if (number[left] + number[right] < givenumber)
                left++;
            else
                right--;

        }
        return new int[0];
    }

    public static void main(String[] args) {
        int number[] = { 2, 3, 4, 5, 6, 7, 11, 13 };
        int givennumber = 17;
        System.out.println(towpointer(number, givennumber));
    }
}

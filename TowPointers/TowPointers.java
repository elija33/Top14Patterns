package TowPointers;

public class TowPointers {
    public static int[] towpointer(int number[], int givenumber) {
        // the beginning of the array
        int start = 0;
        // The end of the array
        int end = number.length;

        while (start < end) {

            // cheeck if the start array and the end array add up to our given number
            if (number[start] + number[end] == givenumber)
                // retrun true if they add up to our givennumber
                return new int[] { number[start], number[end] };

            // if they do not add up to our given number, we start decrements the end to
            // find out if they add up
            else if (number[start] + number[end] < givenumber)
                start++;
            else
                end--;

        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int number[] = { 2, 3, 4, 5, 6, 7, 11, 13 };
        int givennumber = 17;
        System.out.println(towpointer(number, givennumber));
    }
}

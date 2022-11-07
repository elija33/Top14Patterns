package MergeIntervals.EfficientMergeIntervals;

import java.util.Arrays;
import java.util.Comparator;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.end = end;
        this.start = start;
    }
}

public class EfficientMergeInt {

    public static void meregeIntervals(Interval number[]) {
        // Sort Intervals in increasing order of
        // start time
        Arrays.sort(number, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });

        int index = 0; // Stores index of last element
        // in output array (modified arr[])

        // Traverse all input Intervals
        for (int i = 1; i < number.length; i++) {
            // If this is not first Interval and overlaps
            // with the previous one
            if (number[index].end >= number[i].start) {
                // Merge previous and current Intervals
                number[index].end = Math.max(number[index].end, number[i].end);
            } else {
                index++;
                number[index] = number[i];
            }
        }

        // Now arr[0..index-1] stores the merged Intervals
        System.out.print("The Merged Intervals are: ");
        for (int i = 0; i <= index; i++) {
            System.out.print("[" + number[i].start + ","
                    + number[i].end + "]");
        }
    }

    public static void main(String[] args) {
        Interval arr[] = new Interval[4];
        arr[0] = new Interval(6, 8);
        arr[1] = new Interval(1, 9);
        arr[2] = new Interval(2, 4);
        arr[3] = new Interval(4, 7);
        meregeIntervals(arr);
    }
    // {{6,8}, {1,9}, {2,4}, {4,7}}
    // {{1,9}, {2,4}, {4,7}} ==> {{1,9}}
}

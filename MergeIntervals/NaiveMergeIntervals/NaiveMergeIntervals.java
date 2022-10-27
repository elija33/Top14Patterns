package MergeIntervals.NaiveMergeIntervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class NaiveMergeIntervals {
    public static void mergeintervals(Interval number[]) {
        if (number.length <= 0)
            return;

        Stack<Interval> name = new Stack<>();

        Arrays.sort(number, new Comparator<Interval>() {
            public int compare(Interval word, Interval word2) {
                return word.start - word2.start;
            }
        });

        name.push(number[0]);

        for (int i = 1; i < number.length; i++) {
            Interval top = name.peek();

            if (top.end < number[i].start)
                name.push(number[i]);

            else if (top.end < number[i].end) {
                top.end = number[i].end;
                name.pop();
                name.push(top);
            }
        }

        System.out.println("The Merged Intervals are: ");
        while (!name.isEmpty()) {
            Interval merg = name.pop();
            System.out.println("[" + merg.start + "," + merg.end + "]");
        }
    }

    public static void main(String[] args) {
        Interval number[] = new Interval[4];
        number[0] = new Interval(6, 8);
        number[1] = new Interval(1, 9);
        number[2] = new Interval(2, 4);
        number[3] = new Interval(4, 7);
        mergeintervals(number);
    }
}

// {{6,8},{1,9},{2,4},{4,7}}
// {{1,9},{2,4},{4,7}}
// [1,9]
class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.end = end;
        this.start = start;
    }
}

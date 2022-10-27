package MergeIntervals.EfficientMergeIntervals;

import java.util.Arrays;
import java.util.Comparator;

import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

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
        Arrays.sort(number, new Comparator<Interval>() {
            public int compare(Interval word, Interval word2) {
                return word.start = word2.start;
            }
        });

        int index = 0;

        for (int i = 1; i < number.length; i++) {
            if (number[index].end >= number[i].start) {
                number[index].end = Math.max(number[index].end, number[i].end);
            } else {
                index++;
                number[index] = number[i];
            }
        }
        System.out.println("The Merged Intervals are: ");
        for (int i = 0; i <= index; i++) {
            System.out.println("[" + number[i].start + "," + number[i].end + "]");
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

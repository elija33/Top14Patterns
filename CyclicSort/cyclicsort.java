package CyclicSort;

public class cyclicsort {
    static void cycleSortDistinct(int number[]) {
        for (int cs = 0; cs < number.length; cs++) {
            int item = number[cs];
            int pos = cs;
            for (int i = cs + 1; i < number.length; i++)
                if (number[i] < item)
                    pos++;
            // swap(item,arr[pos])

            int temp = item;
            item = number[pos];
            number[pos] = temp;
            while (pos != cs) {
                pos = cs;
                for (int i = cs + 1; i < number.length; i++)
                    if (number[i] < item)
                        pos++;

                // swap(item,arr[pos])
                temp = item;
                item = number[pos];
                number[pos] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int number[] = { 20, 40, 50, 10, 30 };
        cycleSortDistinct(number);

        for (int i = 0; i < number.length; i++)
            System.out.print(number[i] + " ");
    }
}

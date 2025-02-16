package Ex1;

import java.util.ArrayList;
import java.util.List;

public class Exercise9 {
    public static List<Integer> getEvenList(int[] numbers) {
        List<Integer> evenList = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenList.add(num);
            }
        }
        return evenList;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 6, 11};
        System.out.println("Even numbers from list: " + getEvenList(numbers));
    }
}


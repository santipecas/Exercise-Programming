package Ex1;

import java.util.ArrayList;
import java.util.List;

public class Exercise10 {
    public static List<Integer> evenList(int n) {
        List<Integer> evens = new ArrayList<>();
        for (int i = 2; i <= n; i += 2) {
            evens.add(i);
        }
        return evens;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println("First even numbers up to " + n + ": " + evenList(n));
    }
}

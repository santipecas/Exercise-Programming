package Ex1;

public class Exercise7 {
    public static int sumEven(int n) {
        int sum = 0;
        for (int i = n; i >= 2; i -= 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println("Sum of first even numbers up to " + n + ": " + sumEven(n));
    }
}

package Ex1;

public class Exercise4 {
    public static int sumList(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of elements: " + sumList(numbers));
    }
}

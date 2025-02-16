package Ex1;

public class Exercise8 {
    public static int sumEvenElements(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        System.out.println("Sum of even elements: " + sumEvenElements(numbers));
    }
}

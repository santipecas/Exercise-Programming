package Ex1;

public class Exercise5 {
    public static double arithmeticMean(int[] numbers) {
        if (numbers.length == 0) return 0;
        return (double) Exercise4.sumList(numbers) / numbers.length;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Arithmetic mean: " + arithmeticMean(numbers));
    }
}

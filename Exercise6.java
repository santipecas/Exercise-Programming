package Ex1;

public class Exercise6 {
    public static double standardDeviation(int[] numbers) {
        if (numbers.length == 0) return 0;
        double mean = Exercise5.arithmeticMean(numbers);
        double sumSquaredDiffs = 0;
        for (int num : numbers) {
            sumSquaredDiffs += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDiffs / numbers.length);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Standard deviation: " + standardDeviation(numbers));
    }
}

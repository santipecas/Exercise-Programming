package Ex1;

public class Exercise11 {
    public static int computeDotProduct(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            throw new IllegalArgumentException("Both lists must have the same size.");
        }

        int dotProduct = 0;
        for (int i = 0; i < list1.length; i++) {
            dotProduct += list1[i] * list2[i];
        }
        return dotProduct;
    }

    public static void main(String[] args) {
        int[] list1 = {1, 2, 3};
        int[] list2 = {2, 4, 6};
        System.out.println("Dot product: " + computeDotProduct(list1, list2));
    }
}

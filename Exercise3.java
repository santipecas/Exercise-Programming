package Ex1;

public class Exercise3 {

    public static long power(int base, int exponent){
        long result = 1;

        for (int i = 1; i <= exponent; i++){
        result *= base;
        } 
    return result;
    }
public static void main(String[] args){
    int base = 2;
    int exponent = 5;
    
    System.out.println(base + " raised to the power of " + exponent + " is: " + power(base, exponent));
}
}

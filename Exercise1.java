package Ex1;
public class Exercise1 {
    public static int sumar(int n){
        int sum = 0;

        for (int i = 0; i <= n; i++){
            sum += i;
        }
     return sum;
    }
   public static void main(String[] args) {
    
    int n = 10;
    System.out.println("Sum from 0 to " + n + " is: " + sumar(n));
   }


}

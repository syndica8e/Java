import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N value => ");
        int number = in.nextInt();

        check(number);
    }

    public static void check(int a) {
        // prime - not divisible
        System.out.println("----Everybody is a Gansta till you see the PrimeSta----");
        for (int i = 2; i <= a; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {  //checking if any number can perfectly divide the input number
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(i + " ");
            }
        }
    }
}

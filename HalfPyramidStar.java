import java.util.Scanner;

public class HalfPyramidStar {
  public static void main(String[] args) {
    System.out.println("Enter the size of the pyramid: ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

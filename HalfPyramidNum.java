import java.util.Scanner;

public class HalfPyramidNum {
  public static void main(String[] args) {
    System.out.println("Enter rows of the pyramid");
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    System.out.println("Output : ");
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
  }
}
}
import java.util.Scanner;

public class InvertedHalfPyramidNum {
  public static void main(String[] args) {
    System.out.println("Enter rows for Inverted Half Pyramid: ");
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    for(int i = 0; i < rows; i++) {
      for(int j = 1; j <= rows-i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
  }
}
}

import java.util.Scanner;

public class FloydsTriangle {
  public static void main(String[] args) {
    System.out.println("Enter rows in FLOYDS Triangle : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Output : ");
    int counter = 1;
    for (int i = 1; i <= n; i++) {
      for(int j =1; j<=i;j++){
        System.out.print(counter + " ");
        counter++;
      }System.out.println();
  }
}
}

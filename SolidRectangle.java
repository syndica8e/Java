import java.util.Scanner;

public class SolidRectangle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int n = in.nextInt();
    for(int i = 0 ;i<n ; i++){
      for (int j = 0 ; j<n+1 ; j++){
        System.out.print("*");
    }System.out.println();
  }
}
}

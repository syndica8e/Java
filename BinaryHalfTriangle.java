import java.util.Scanner;

public class BinaryHalfTriangle {
  public static void main(String[] args) {
    System.out.println("Enter number of rows: ");
    Scanner input = new Scanner(System.in);
    int rows = input.nextInt();
    System.out.println("=======Output======= ");
    for (int i = 1; i < rows; i++) {
      for (int j = 1; j <=i; j++) {
        int sum = i+j;
        if( sum % 2 == 0) {
          System.out.print("1"+" ");
        }else if(sum % 2 == 1){
          System.out.print("0"+" ");
        }
  }System.out.println();
}
}
}
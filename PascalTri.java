import java.util.Scanner;

public class PascalTri {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of rows you want in Pascal's Triangle: ");
      int n = input.nextInt();

      for (int i = 0; i < n; i++) {
         int count = 1;
         for( int j =0 ; j<= n-i ; j++){
            System.out.print(" ");
         }
         for (int j = 0; j <= i; j++) {
            System.out.print( count+ " ");
            count = count * (i - j) / (j + 1);
         }
         System.out.println();
      }
   }
}

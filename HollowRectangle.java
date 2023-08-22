import java.util.Scanner;

public class HollowRectangle {
  public static void main(String[] args) {
    System.out.println("Enter the number of rows and columns of the Hollow Rectangle n where n = rows n+1 = cols: ");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i =1 ; i<=n;i++){
      for(int j =1; j<n+1;j++){
        if(i==1 || i==n){
        System.out.print("*");
      }else if(j==1 || j==n){
        System.out.print("*");
      }
      else{
        System.out.print(" ");
      }
    }System.out.println();
  }
}
}
import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size N for ButterFly -> ");

        int n = in.nextInt();
//////////////UPPER HALF        
        for ( int i =1 ; i<=n ; i++){
            //star code
            for ( int j =1 ; j<=i ; j++){
                System.out.print("*");
            }
            //space code
            int spaces = 2*(n-i);
            for ( int j =1; j<=spaces;j++ ){
                System.out.print(" ");
            }
            //star code
            for( int j = (2*n)-(i); j<2*n;j++){
                System.out.print("*");
            }
            
            
            System.out.println();
        }
//////////////LOWER HALF        
        for ( int i =n ; i>=1 ; i--){
            //star code
            for ( int j =1 ; j<=i ; j++){
                System.out.print("*");
            }
            //space code
            for ( int j =i+1; j<=(2*n)-(i);j++ ){
                System.out.print(" ");
            }
            //star code
            for( int j = (2*n)-(i); j<2*n;j++){
                System.out.print("*");
            }
            
            
            System.out.println();
        }
    }
}

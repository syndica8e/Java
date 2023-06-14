import java.util.Scanner;

public class HollowButterfly {
    public static void main(String[] args) {
        int n =5;
        /////UPPER
        for ( int i =1; i<=n;i++ ){
            for (int j =1 ;j<=i;j++ ){
                //(i,j)
                if( j==1 || j ==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //spaces
            for( int j =1 ; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //reverse * 
            for(int j = 1;j<=i;j++){
                //(i,j)
                if( j==1 || j ==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /////LOWER
        for ( int i =n; i>=1;i-- ){
            for (int j =1 ;j<=i;j++ ){
                //(i,j)
                if( j==1 || j ==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //spaces
            for( int j =1 ; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //reverse * 
            for(int j = 1;j<=i;j++){
                //(i,j)
                if( j==1 || j ==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

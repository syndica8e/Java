import java.util.Scanner;

public class PyramidNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size of the Pyramid --> ");
        
        int number = in.nextInt();
        for ( int i = 1 ; i <= number ; i++ )
        {
            for( int j =1 ; j <= number-i;j++ ){
                System.out.print(" ");
            }
            for ( int j = 1 ; j<= i; j++)
            {
               if( i <10){
                System.out.print(i+"   ");
               }else if(i>=10){
                System.out.print(i+"  ");
               }
               else if(i>=100){
                System.out.print(i+" ");
               }
            }
        System.out.println();
        }
    }
}

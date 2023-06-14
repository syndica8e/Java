import java.util.Scanner;

public class PyramidNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of Pyramid -> ");
        int N = in.nextInt();
        
        for (int i = 1; i <=N ; i++ ){
            //i = 4
            for ( int j = 1; j<=N-i;j++){
                System.out.print("  ");
            }
            for ( int j =i ; j >=1; j--){
                System.out.print(j+" ");
            }
            for( int j =2 ;j<=i ; j++  ){
                System.out.print(j+" ");
            }System.out.println();
        }
    }
}

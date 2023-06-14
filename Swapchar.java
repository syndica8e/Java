import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Swapchar {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        int[] array = new int[S.length()];
        for ( int i = 0 ; i<S.length();i++){
           array[i] = S.charAt(i);   
        }
        for ( int i = 1 ; i<=S.length();i+=2){
            //swap(i,i-1);
            int temp = array[i]; 
            array[i]= array[i-1];
            array[i-1] = temp;
            System.out.print(array[i-1]);
            
         }
    }
}

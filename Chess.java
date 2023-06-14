import java.util.*;
import java.io.*;
import java.math.*;

//Program prints Chessboard
class Chess {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int w =  in.nextInt(); //6
        int h = in.nextInt();  //3
        String white = in.next(); //#
        String black = in.next(); //.
        //inputs
        // 6 , 3  == w,h
        // # . = white , black

        //0     #.#.#.    012345
        //1     .#.#.#
        //2     #.#.#.
        
        for ( int j =0 ; j<h; j++){
            for(int i =0 ; i <w; i ++ ){
                if ( j%2 ==0 ){
                    if( i%2 == 0){ //even
                        System.out.print(white);
                    }else if( i%2 == 1){
                        System.out.print(black);
                    }
                }else if (j%2 ==1){
                    if( i%2 == 0){ //even
                        System.out.print(black);
                    }else if( i%2 == 1){
                        System.out.print(white);
                    }
                } 
        }System.out.println();
    } 
}
}
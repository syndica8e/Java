import java.util.*;


public class Excercise {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];


      //input
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }

      System.out.println("Before Sorting");
      for(int i =0 ; i < numbers.length;i++){
        System.out.println(numbers[i]);
      }
      System.out.println("After Sorting");
      Arrays.sort(numbers);
      for(int i =0 ; i < numbers.length;i++){
        System.out.println(numbers[i]);
      }
   }
}

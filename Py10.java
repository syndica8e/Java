import javax.swing.text.PasswordView;

public class Py10 {
    public static void main(String[] args) {
        for ( int i =1 ; i<=5;i++){
            for (int j =1 ; j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else if((i+j)%2==1){
                    System.out.print("0 ");
                }
            }System.out.println();
        }
    }
}

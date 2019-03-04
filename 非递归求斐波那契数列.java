
import java.util.*;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n == 1){
            System.out.println(1);
        }
        if(n == 2){
            System.out.println(1);
        }
        else{
            int f2 = 1;
            int f1 = 1;
            for(int i = 3 ; i<= (n-3)/2+3; i++){
                f1 = f1 + f2;//f3
                f2 = f2 + f1;//f4
            }
            if(n%2 == 0){
                System.out.println(f2);
            }
            else{
                System.out.println(f1);
            }
        }
    }
}

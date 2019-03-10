
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a < 2){
            System.out.println(0);
        }
        else{
            System.out.println((a-2)*2+1);
        }
        return;
    }
}

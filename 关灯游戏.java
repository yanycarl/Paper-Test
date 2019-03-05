
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
        
        int times = 0;
        for(int i = array.length-1; i>0; i--){
            if(array[i] != array[i-1]){
                times++;
            }
        }
        if(array[0] == 1){
            times++;
        }
        if(times %2 == 0){
            System.out.println("Bob");
        }
        else{
            System.out.println("Alice");
        }
    }
}
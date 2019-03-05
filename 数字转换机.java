
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
        int times = 0;
        if(array[2] %2 == 1){
            times += 1;
            array[2] -= 1;
            array[3] -= 1;
        }
        while(array[2] >= 2*array[0]){
            array[2] /= 2;
            array[3] /= 2;
            times+=1;
        }
        times += array[2]-array[0];
        array[3] -= array[2]-array[0];
        if(array[3] != array[1]){
            System.out.println(-1);
        }
        else{
            System.out.println(times);
        }
    }
}
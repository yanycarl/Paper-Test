import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
        if(array[0] < array[1] + array[2]){
            System.out.println("DEADLOCK");
        }
        else{
            System.out.println("OK");
        }
    }
}

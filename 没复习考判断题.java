import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
        int trueRight = array[2];
        int trueFalse = array[0] - array[2];
        int testRight = array[1];
        int testFalse = array[0] - array[1];
        int sum = 0;
        
        if(trueRight >= testRight){
            sum += testRight;
            sum += trueFalse;
        }
        else{
            sum += trueRight;
            sum += testFalse;
        }
        System.out.println(sum);
    }
}


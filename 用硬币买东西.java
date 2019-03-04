import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] coinValue = new int[]{1,5,10,50,100,500};
        int[] coins = null;
        coins = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
        
        int amount = 0;
        for(int i=5; i>=0; i--){
            while(coins[i] > 0 && coinValue[i] <= coins[6]){
                coins[6] -= coinValue[i];
                coins[i]--;
                amount++;
            }
        }
        if(coins[6]>0){
            System.out.println("NOWAY");
        }
        else if(coins[6]==0){
            System.out.println(amount);
        }
    }
}

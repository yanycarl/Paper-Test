import java.util.*;
 
public class Main {
    private static final int MAX = 1005;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        int count = 0;
        for (; n1 != 0 || n2 !=0; n1 >>= 1, n2 >>= 1) {
            if ((n1 & 1) != (n2 & 1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}

import java.util.*;

class TreeNode {
    int val = -1;
    TreeNode left = null;
    TreeNode right = null;
    TreeNode(int val) {
        this.val = val;
    }
}

public class Main{
    
    public static boolean checkTree(TreeNode tree, int min, int max){
        boolean result = false;
        if(tree == null){
            return true;
        }
        if(tree.val > max || tree.val < min){
            return false;
        }
        else{
            return checkTree(tree.left, min, tree.val) && checkTree(tree.right, tree.val, max);
        }
    }
    
    public static void main(String[] args){
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        Scanner scanner = new Scanner(System.in);
        TreeNode tree = new TreeNode(scanner.nextInt());
        TreeNode temp = null;
        list.addLast(tree);
        scanner.nextLine();
        int[] arr = Arrays.stream(scanner.nextLine().split("[\\:\\|]+?")).mapToInt(Integer::valueOf).toArray();
        if(arr[1] != -1){
            temp = new TreeNode(arr[1]);
            TreeNode temp2 = (TreeNode)list.getFirst();
            temp2.left = temp;
            list.addLast(temp);
        }
        if(arr[2] != -1){
            temp = new TreeNode(arr[2]);
            TreeNode temp2 = (TreeNode)list.getFirst();
            temp2.right = temp;
            list.addLast(temp);
        }
        list.removeFirst();
        
        while(list.size() != 0 && scanner.hasNextLine()){
        	arr = Arrays.stream(scanner.nextLine().split("[\\:\\|]+?")).mapToInt(Integer::valueOf).toArray();
            if(arr[1] != -1){
                temp = new TreeNode(arr[1]);
                TreeNode temp2 = (TreeNode)list.getFirst();
                temp2.left = temp;
                list.addLast(temp);
            }
            if(arr[2] != -1){
                temp = new TreeNode(arr[2]);
                TreeNode temp2 = (TreeNode)list.getFirst();
                temp2.right = temp;
                list.addLast(temp);
            }
            list.removeFirst();
        }
        if(checkTree(tree, Integer.MIN_VALUE, Integer.MAX_VALUE) == false) {
        	System.out.println(0);
        }
        else {
        	System.out.println(1);
        }
    }
}



import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int e = scanner.nextInt();
        scanner.nextLine();
        int[] weight = new int[n+1];
        int[] currentSituaction = new int[n+1];
        weight[0]=-1;
        currentSituaction[0]=-1;
        for(int i=1; i<n; i++){
            weight[i]=0;
            currentSituaction[i]=0;
        }

        LinkedHashMap<Integer, ArrayList> outers = new LinkedHashMap<Integer, ArrayList>();
         for(int i = 0; i<n;i++){
            int tempNode = scanner.nextInt();
            int tempWeight = scanner.nextInt();
            scanner.nextLine();
            weight[tempNode] = tempWeight;
        }
        for(int i = 0; i<e;i++){
            int tempInner = scanner.nextInt();
            int tempOuter = scanner.nextInt();
            scanner.nextLine();
            if(outers.containsKey(tempInner)){
                ArrayList tempList = (ArrayList)outers.get(tempInner);
                tempList.add(tempOuter);
                currentSituaction[tempOuter] += 1;
            }
            else{
                ArrayList tempList = new ArrayList<Integer>();
                tempList.add(tempOuter);
                outers.put(tempInner, tempList);
                currentSituaction[tempOuter] += 1;
            }
        }
        
        for(int j=0; j<n; j++){
            if(j!=0) System.out.print(" ");
            int tempMaxPos = -1;
            int currentMax = 0;
            for(int i=1; i<n+1; i++){
                if(currentSituaction[i] == 0 && weight[i] > currentMax){
                    tempMaxPos = i;
                }
            }
            if(outers.size()>0){
                currentSituaction[tempMaxPos] = -1;
                ArrayList<Integer> tempList = (ArrayList) outers.get(tempMaxPos);
                Iterator<Integer> itor = tempList.iterator();
                while(itor.hasNext()){
                    currentSituaction[(int)itor.next()]--;
                }
                outers.remove(tempMaxPos);
            }
            System.out.print(tempMaxPos);
        }
    }
}


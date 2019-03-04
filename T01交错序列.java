import java.io.*;

public class Main{
    public static void main(String[] args){
        BufferedReader bufferedReader = new BufferedReader(
            new InputStreamReader(System.in));
        String content = null;
        try{
            content = bufferedReader.readLine();
        }
        catch(IOException e){
            System.out.println("EX");
        }
        int amount = Integer.parseInt(content);
        try{
            content = bufferedReader.readLine();
        }
        catch(IOException e){
            System.out.println("EX");
        }
        char[] list = null;
        list = content.toCharArray();
        
        int max = 0;
        for(int i=0; i<list.length; i+=2){
            int currentMax = 0;
            int lastItem = -1;
            for(int j=0; j<=i; j+=2){
                if(lastItem == -1){
                    if(list[j] == '0'){
                        lastItem = 0;
                        currentMax = 1;
                    }
                    else if(list[j] == '1'){
                        lastItem = 1;
                        currentMax = 1;
                    }
                }
                else if(lastItem == 0){
                    if(list[j] == '0'){
                        currentMax = 1;
                    }
                    else if(list[j] == '1'){
                        currentMax += 1;
                        lastItem = 1;
                    }
                    else{
                        currentMax = 0;
                        lastItem = -1;
                    }
                }
                else if(lastItem == 1){
                    if(list[j] == '1'){
                        currentMax = 1;
                    }
                    else if(list[j] == '0'){
                        currentMax += 1;
                        lastItem = 0;
                    }
                    else{
                        currentMax = 0;
                        lastItem = -1;
                    }
                }
                if(currentMax > max){
                    max = currentMax;
                }
            }
        }
        System.out.print(max);
    }
}


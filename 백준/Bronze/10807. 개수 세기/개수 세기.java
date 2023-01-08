import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numArray = new int[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = 0;

        for(int i = 0; i < numArray.length; i++){
            numArray[i] = Integer.parseInt(st.nextToken());
        }
        int findNum = Integer.parseInt(br.readLine());

        for(int i = 0; i < numArray.length; i++){
            if(findNum == numArray[i]){
                count++;
            }
        }
        System.out.print(count);
    }
}
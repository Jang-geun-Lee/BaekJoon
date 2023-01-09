import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] numArray = new int[9];
        int[] tempNumArray = new int[9];
        for(int i = 0; i < 9; i++){
            st = new StringTokenizer((br.readLine()), " ");
            numArray[i] = Integer.parseInt(st.nextToken());
            tempNumArray[i] = numArray[i];
        }
        Arrays.sort(numArray);
        System.out.println(numArray[8]);

        for(int i = 0; i < 9; i++){
            if(tempNumArray[i] == numArray[8]){
                System.out.print(i+1);
            }
        }

    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] numArray = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++){
            numArray[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numArray);
        System.out.print(numArray[0] + " " + numArray[n-1]);

    }
}
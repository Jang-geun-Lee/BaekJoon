import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }

        for(int k = 0; k < m; k++){
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            Reverse.reverseFunc(arr, i-1, j);
        }

        for(int p = 0; p < n; p++){
            System.out.print(arr[p] + " ");
        }
        br.close();
    }
}
class Reverse{
    static void reverseFunc(int[] arr, int i, int j) {
        int[] copy = Arrays.copyOfRange(arr, i, j);
        int len = copy.length;
        for(int k = 0; k < len; k++) {
            arr[i + k]= copy[len - (k + 1)];
        }
    }
}
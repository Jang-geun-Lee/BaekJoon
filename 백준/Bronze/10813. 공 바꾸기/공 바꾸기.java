import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for(int t = 0; t < n; t++){
            arr[t] = t + 1;
        }

        for(int p = 0; p < m; p++){
            st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int temp = arr[i-1];

            arr[i-1] = arr[j-1];
            arr[j-1] = temp;
        }

        for(int q = 0; q < n; q++){
            System.out.print(arr[q] + " ");
        }

        br.close();
    }
}
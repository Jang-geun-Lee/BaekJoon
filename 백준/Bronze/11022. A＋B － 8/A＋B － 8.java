import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int[] aArray = new int[count];
        int[] bArray = new int[count];
        int[] sum = new int[count];
        int j = 1;

        for(int i = 0; i < count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            aArray[i] = a;
            bArray[i] = b;
            sum[i] = a + b;
        }

        for(int i = 0; i < count; i++){
            System.out.println("Case #" + j + ": " + aArray[i] + " + " + bArray[i] + " = " + sum[i]);
            j++;
        }

        br.close();
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(br.readLine());
        int[] sum = new int[count];
        
        for(int i = 0; i < count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sum[i] = a+b;
        }
        
        for(int i = 0; i < count; i++){
            System.out.println(sum[i]);
        }
        
        br.close();
    }
}
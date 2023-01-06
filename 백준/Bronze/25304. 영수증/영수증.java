import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int totalPrice = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());
        int sum = 0;
        
        for(int i = 0; i < count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int price = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            sum += price * num;
        }
        
        if(totalPrice == sum){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        
        br.close();
    }
}
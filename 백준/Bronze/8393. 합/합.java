import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(br.readLine());
        int result = 0;
        
        for(int i = 1; i <= count; i++){
            result+=i;
        }
        System.out.print(result);
        
        br.close();
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int result = cal(n);
        System.out.print(result);

    }
    public static int cal(int n){
        if(n <= 1){
            return 1;
        }
        return n * cal(n - 1);
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 2; i <= n;){
            if(n % i == 0){
                System.out.println(i);
                n /= i;
                i = 2;
            }
            else{
                i++;
            }
        }

    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num  = Integer.parseInt(br.readLine());
        int result = num;
        int count = 0;

        while(true){
            num = num%10*10 +  (num/10 + num%10)%10;
            count++;
            if(num == result){
                break;
            }
        }
        System.out.print(count);
    }
}
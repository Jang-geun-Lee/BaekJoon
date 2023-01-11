import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int result = 0;

        for(int i = 0; i < length; i++){
            result += (num.charAt(i) - '0');
        }
        System.out.print(result);
    }
}
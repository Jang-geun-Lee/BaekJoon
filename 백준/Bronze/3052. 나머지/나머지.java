import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean[] numArray = new boolean[42];
        int count = 0;

        for(int i = 0; i < 10; i++){
            numArray[Integer.parseInt(br.readLine())%42] = true;
        }

        for(int i = 0; i < 42; i++){
            if(numArray[i]){
                count++;
            }
        }
        System.out.print(count);
    }
}
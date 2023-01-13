import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){
            stringTokenizer  = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(stringTokenizer.nextToken());
            int w = Integer.parseInt(stringTokenizer.nextToken());
            int n = Integer.parseInt(stringTokenizer.nextToken());
            if(n%h == 0){
                System.out.println((h*100) + (n / h));
            }
            else{
                System.out.println(((n%h)*100) + ((n / h) + 1));
            }
        }
    }
}
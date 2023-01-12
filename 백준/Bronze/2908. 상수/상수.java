import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        String a = stringTokenizer.nextToken();
        String b = stringTokenizer.nextToken();
        int reverseA = ((a.charAt(2) - '0') * 100) + ((a.charAt(1) - '0') * 10) + (a.charAt(0) - '0');
        int reverseB = ((b.charAt(2) - '0') * 100) + ((b.charAt(1) - '0') * 10) + (b.charAt(0) - '0');

        if(reverseA > reverseB){
            System.out.print(reverseA);
        }
        else if(reverseA < reverseB){
            System.out.print(reverseB);
        }

    }
}
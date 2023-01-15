import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        BigInteger a = new BigInteger(stringTokenizer.nextToken());
        BigInteger b = new BigInteger(stringTokenizer.nextToken());

        System.out.print(a.add(b));
    }
}
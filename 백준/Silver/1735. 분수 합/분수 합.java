import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int b1 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        int c1 = a1 * b2 + a2 * b1;
        int c2 = a2 * b2;

        int gcd = getGcd(c1, c2);

        System.out.print(c1 / gcd + " " + c2 / gcd);
    }

    public static int getGcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGcd(b, a % b);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long testCase = Long.parseLong(br.readLine());

        for (long i = 0; i < testCase; i++) {
            for (long n = Long.parseLong(br.readLine()); ;n++) {
                if (isPrime(n)) {
                    sb.append(n).append("\n");
                    break;
                }
            }
        }

        System.out.print(sb);
    }

    public static boolean isPrime(long n) {

        boolean isPrime = true;

        if (n >= 0 && n <= 1) {
            isPrime = false;
        }

        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
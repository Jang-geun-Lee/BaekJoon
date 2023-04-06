import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());
        int d = Integer.parseInt(stringTokenizer.nextToken());
        int e = Integer.parseInt(stringTokenizer.nextToken());
        int f = Integer.parseInt(stringTokenizer.nextToken());

        int x;
        int y;

        for (int i = -999; i < 1000; i++) {
            for (int j = -999; j < 1000; j++) {
                if (a*i+b*j==c && d*i+e*j==f) {
                    System.out.println(i+" "+j);
                }
            }
        }

    }
}
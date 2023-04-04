import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            if (str.equals("ENTER")) {
                hashSet = new HashSet<>();
                continue;
            }

            if (!hashSet.contains(str)) {
                count++;
                hashSet.add(str);
            }
        }

        System.out.print(count);
    }
}
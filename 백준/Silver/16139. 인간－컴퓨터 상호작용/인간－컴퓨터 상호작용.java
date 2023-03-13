import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String str = br.readLine();
        int q = Integer.parseInt(br.readLine());
        int[][] arr = new int[str.length()+1][26];

        arr[0][str.charAt(0) - 97]++;

        for (int i = 1; i < str.length(); i++) {
            for (int j = 0; j < 26; j++) {
                arr[i][j] = arr[i -1][j];
            }
            arr[i][str.charAt(i) - 97]++;
        }

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            char key = st.nextToken().charAt(0);
            int keyInt = key - 97;
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            if (l == 0) {
                System.out.println(arr[r][keyInt]);
            } else {
                System.out.println(arr[r][keyInt] - arr[l -1][keyInt]);
            }
        }
    }
}
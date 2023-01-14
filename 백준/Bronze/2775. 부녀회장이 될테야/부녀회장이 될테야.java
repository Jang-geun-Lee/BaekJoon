import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static int[][] aptArray = new int[15][15];

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        make();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(aptArray[k][n]).append('\n');
        }
        System.out.println(sb);
    }

    public static void make() {
        for (int i = 0; i < 15; i++){
            aptArray[i][1] = 1;
            aptArray[0][i] = i;
        }
        for (int i = 1; i < 15; i++){
            for (int j = 2; j < 15; j++){
                aptArray[i][j] = aptArray[i][j - 1] + aptArray[i - 1][j];
            }
        }
    }
}
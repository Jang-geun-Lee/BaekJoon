import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int treeSize = Integer.parseInt(st.nextToken());
        int[] treeArr = new int[treeSize];
        int[] interval = new int[treeSize - 1];

        for (int i = 0; i < treeSize; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            treeArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < interval.length; i++) {
            interval[i] = Math.abs(treeArr[i] - treeArr[i+1]);
        }

        int real_inter = interval[0];

        for(int i = 1; i < interval.length; i++){
            real_inter = getGcd(real_inter, interval[i]);
        }

        int result = -treeSize;

        for(int i = treeArr[0]; i <= treeArr[treeSize-1]; i += real_inter){
            result++;
        }

        System.out.println(result);
    }

    public static int getGcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGcd(b, a % b);
    }
}
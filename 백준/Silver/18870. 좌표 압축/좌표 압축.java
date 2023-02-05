import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] originArr = new int[n];
        int[] sortedArr = new int[n];
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < n; i++) {
            sortedArr[i] = originArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sortedArr);

        int rank = 0;
        for(int v : sortedArr) {
            if(!rankingMap.containsKey(v)) {
                rankingMap.put(v, rank);
                rank++;
            }
        }
        
        StringBuilder stringbuilder = new StringBuilder();
        
        for(int key : originArr) {
            int ranking = rankingMap.get(key);
            stringbuilder.append(ranking).append(' ');
        }
        
        System.out.println(stringbuilder);
    }
}
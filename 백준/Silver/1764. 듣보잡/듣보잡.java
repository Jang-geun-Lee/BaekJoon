import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> listenHashSet = new HashSet<>();
        ArrayList<String> resultArr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            listenHashSet.add(br.readLine());
        }

        for(int i = 0; i < m; i++){
            String str = br.readLine();
            if(listenHashSet.contains(str)){
                resultArr.add(str);
            }
        }

        Collections.sort(resultArr);

        System.out.println(resultArr.size());
        for(int i = 0; i < resultArr.size(); i++){
            System.out.println(resultArr.get(i));
        }
    }
}
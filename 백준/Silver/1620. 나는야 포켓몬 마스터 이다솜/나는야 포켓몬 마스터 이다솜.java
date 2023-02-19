import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        HashMap<Integer, String> int_map = new HashMap<>();
        HashMap<String, Integer> str_map = new HashMap<>();

        for(int i=1; i<=n; i++){
            String str = br.readLine();
            int_map.put(i, str);
            str_map.put(str, i);
        }

        for(int i=0; i<m; i++){
            String str = br.readLine();

            if(isInteger(str)) {
                int num = Integer.parseInt(str);
                sb.append(int_map.get(num)).append("\n");
            }
            else {
                sb.append(str_map.get(str)).append("\n");
            }
        }

        System.out.println(sb);

    }

    public static boolean isInteger(String str) {
        try{
            Integer.parseInt(str);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
}
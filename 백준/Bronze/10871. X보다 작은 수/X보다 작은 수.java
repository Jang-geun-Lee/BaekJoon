import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int findNum = Integer.parseInt((st.nextToken()));

        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < n; i++){
            int j = Integer.parseInt(st.nextToken());
            if(j < findNum){
                sb.append(j).append(" ");
            }
        }

        System.out.print(sb);
    }
}
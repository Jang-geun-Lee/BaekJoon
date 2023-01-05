import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(br.readLine());
        int th = t / 60;
        int tm = t % 60;
        
        m += tm;
        if(m >= 60){
            m-=60;
            h++;
        }
        h += th;
        if(h >= 24){
            h-=24;
        }
        
        System.out.print(h + " " + m);
        
        br.close();
    }
}
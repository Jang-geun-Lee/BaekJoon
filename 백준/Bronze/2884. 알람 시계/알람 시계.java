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
        
        if(m < 45){
            if(h == 0){
                h = 23;
                m += 15;
                System.out.print(h + " " + m);
            }
            else{
                h--;
                m += 15;
                System.out.print(h + " " + m);
            }
        }
        else{
            m-=45;
            System.out.print(h + " " + m);
        }
        br.close();
    }
}
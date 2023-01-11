import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;

        int testCase =Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){
            stringTokenizer = new StringTokenizer(br.readLine(), " ");
            int repeatNum = Integer.parseInt(stringTokenizer.nextToken());
            String str = stringTokenizer.nextToken();
            for(int j = 0; j < str.length(); j++){
                for(int k = 0; k < repeatNum; k++){
                    stringBuilder.append(str.charAt(j));
                }
            }
            System.out.println(stringBuilder);
            stringBuilder.setLength(0);
        }

    }
}
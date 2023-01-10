import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int caseNum = Integer.parseInt(br.readLine());

        for(int i = 0; i < caseNum; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int students = Integer.parseInt(st.nextToken());
            int[] scores = new int[students];
            double average = 0;
            double upperAverage = 0;

            for(int j = 0; j < students; j++){
                scores[j] = Integer.parseInt(st.nextToken());
                average += scores[j];
            }

            average /= students;

            for(int k = 0; k < students; k++){
                if(scores[k] > average){
                    upperAverage++;
                }
            }
            System.out.printf("%.3f%%\n", upperAverage/students*100);
        }
    }
}
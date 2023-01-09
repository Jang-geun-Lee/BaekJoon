import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] scoreArray = new int[num];
        double[] newScoreArray = new double[num];
        double averageScore = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < num; i++){
            scoreArray[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(scoreArray);

        for(int i = 0; i < num; i++){
            newScoreArray[i] = ((double) scoreArray[i]/(double) scoreArray[num-1]*100);
        }

        for(int i = 0; i < num; i++){
            averageScore += newScoreArray[i];
        }
        averageScore = averageScore/num;
        System.out.print(averageScore);
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] questionArray = new String[num];
        int scores[] = new int[num];

        for(int i = 0; i < questionArray.length; i++){
            questionArray[i] = br.readLine();
        }

        for(int i = 0; i < questionArray.length; i++){
            int Ocount = 0;
            for(int j = 0; j < questionArray[i].length(); j++){
                if(questionArray[i].charAt(j) == 'O'){
                    Ocount++;
                }
                else{
                    Ocount = 0;
                }
                scores[i] += Ocount;
            }
        }

        for(int i = 0; i < questionArray.length; i++){
            System.out.println(scores[i]);
        }
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int cross = 1;
        int count = 0;


        while(true){
            if(num <= cross + count){
                if(cross % 2 == 1){
                    System.out.print((cross - (num - count - 1)) + "/" + (num - count));
                    break;
                }
                else{
                    System.out.print((num - count) + "/" + (cross - (num - count - 1)));
                    break;
                }
            }
            else{
                count += cross;
                cross++;
            }
        }
    }
}
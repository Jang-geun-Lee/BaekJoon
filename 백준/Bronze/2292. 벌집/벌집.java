import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int count = 1;
        int room = 2;

        if(num == 1){
            System.out.print(count);
        }
        else{
            while(room <= num){
                room += count*6;
                count++;
            }
            System.out.print(count);
        }

    }
}
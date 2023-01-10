import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(func(Integer.parseInt(br.readLine())));

    }

    public static int func(int num){
        int result = 0;

        if (num < 100){
            return num;
        }

        else{
            result = 99;
            for (int i = 100; i <= num; i++){
                int hun = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hun - ten) == (ten - one)){
                    result++;
                }
            }
        }
        return result;
    }
}
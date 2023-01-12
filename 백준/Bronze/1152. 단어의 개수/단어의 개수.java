import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str =br.readLine();
        int count = 1;

        if(str.charAt(0) == ' '){
            count--;
        }

        if(str.charAt(str.length()-1) == ' '){
            count--;
        }

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }

        System.out.print(count);
    }
}
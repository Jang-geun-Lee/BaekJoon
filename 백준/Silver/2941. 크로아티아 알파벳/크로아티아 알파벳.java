import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strArray = new String[str.length()];
        int length = str.length();

        for(int i = 0; i < str.length(); i++){
            if(i != 0 && (str.charAt(i) == '=' || str.charAt(i) == '-')){
                length--;
                if(i > 1 && str.charAt(i-1) == 'z' && str.charAt(i-2) == 'd'){
                    length--;
                }
            }
            if(i != 0 && (str.charAt(i) == 'j' && ((str.charAt(i-1) == 'n'  || str.charAt(i-1) == 'l')))){
                length--;
            }
        }

        System.out.print(length);

    }
}
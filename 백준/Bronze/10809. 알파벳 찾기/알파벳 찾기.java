import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] array = new int[26];

        for(int i = 0; i < 26; i++){
            array[i] = -1;
        }

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(array[c - 'a'] == -1){
                array[c -'a'] = i;
            }
        }

        for(int i = 0; i < 26; i++){
            System.out.print(array[i] + " ");
        }
    }
}
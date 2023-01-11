import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str =br.readLine();
        int[] array = new int[26];
        int max = 0;
        char resultChar = ' ';

        for(int i = 0; i < str.length(); i++){
            for(int asc = 97; asc < 123; asc++){
                if((int) str.charAt(i) == asc){
                    array[str.charAt(i) - 'a']++;
                }
            }
            for(int aSC = 65; aSC < 91; aSC++){
                if((int) str.charAt(i) == aSC){
                    array[str.charAt(i) - 'A']++;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
                resultChar = (char) (i + 65);
            }
            else if(array[i] == max){
                resultChar = '?';
            }
        }

        System.out.print(resultChar);
    }
}
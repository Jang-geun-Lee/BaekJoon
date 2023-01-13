import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfWords = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < numOfWords; i++){
            String str = br.readLine();
            boolean[] strCheck = new boolean[26];
            boolean temp = true;
            for(int j = 0; j < str.length(); j++){
                if(strCheck[str.charAt(j) - 'a'] && str.charAt(j) != str.charAt(j-1)){
                    temp = false;
                    break;
                }
                else{
                    strCheck[str.charAt(j) - 'a'] = true;
                }
            }
            if(temp){
                count++;
            }
        }
        System.out.print(count);

    }
}
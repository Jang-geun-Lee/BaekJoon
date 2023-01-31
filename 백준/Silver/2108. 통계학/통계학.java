import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] count = new int[8001];
        Integer[] arr = new Integer[n];
        int average = 0;
        int mode = 0;
        int max = 0;

        for(int i = 0; i < n; i++){
            int temp = Integer.parseInt(br.readLine());
            temp += 4000;
            arr[i] = temp;
            count[temp]++;
            max = Math.max(max, count[temp]);
        }
        
        for(int i = 0; i < n; i++){
            average += arr[i];
            average -= 4000;
        }

        Arrays.sort(arr, Collections.reverseOrder());

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < count.length; i++){
            if(max == count[i]){
                list.add(i-4000);
            }
        }

        if(list.size()>=2){
            mode = list.get(1);
        }
        else{
            mode = list.get(0);
        }

        System.out.println((int) Math.round((double) average/n));
        System.out.println(arr[n/2]-4000);
        System.out.println(mode);
        System.out.println(arr[0]-arr[n-1]);

        br.close();
    }
}
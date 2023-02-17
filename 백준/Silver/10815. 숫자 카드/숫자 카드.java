import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
 
        int n = Integer.parseInt(br.readLine());
        int[] cardsArr = new int[n];
 
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cardsArr[i] = Integer.parseInt(st.nextToken());
        }
 
        Arrays.sort(cardsArr);
        int m = Integer.parseInt(br.readLine());
 
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int temp = Integer.parseInt(st.nextToken());
            System.out.print(binarySearch(cardsArr, n, temp) + " ");
        }
        br.close();
    }
 
    public static int binarySearch(int[] cardsArr, int n, int search) {
        int first = 0;
        int last = n - 1;
        int mid = 0;
 
        while(first <= last){
            mid = (first + last) / 2;
 
            if(cardsArr[mid] == search){
                return 1;
            }
 
            if(cardsArr[mid] < search){
                first = mid + 1;
            }
            else{
                last = mid - 1;
            }
        }
        return 0;
    }
 
}
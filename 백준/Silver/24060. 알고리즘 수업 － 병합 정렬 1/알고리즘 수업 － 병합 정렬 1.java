import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{

    static int[] tmp;
    static int count = 0;
    static int k;
    static int result = -1;

    public static void merge_sort(int A[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            merge_sort(A, low, mid);
            merge_sort(A, mid + 1, high);
            merge(A, low, mid, high);
        }
    }
    public static void merge(int A[], int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int t = 0;
        while(i <= mid && j <= high) {
            if(A[i] <= A[j]){
                tmp[t] = A[i];
                i++;
            }
            else{
                tmp[t] = A[j];
                j++;
            }
            t++;
        }
        while (i <= mid){
            tmp[t++] = A[i++];
        }
        while (j <= high){
            tmp[t++] = A[j++];
        }
        i = low;
        t = 0;
        while(i <= high){
            count++;
            if(count == k){
                result = tmp[t];
                break;
            }
            A[i++] = tmp[t++];
        }
    }

    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        tmp = new int[n];

        st = new StringTokenizer(bf.readLine(), " ");

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        merge_sort(arr, 0, n-1);
        System.out.print(result);
    }
}
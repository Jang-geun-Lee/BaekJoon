import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int k = Integer.parseInt(br.readLine());
        int[] keyArr = new int[6];
        int[] valueArr = new int[6];
        ArrayList<Integer> widthList = new ArrayList<>();
        ArrayList<Integer> hightList = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            keyArr[i] = Integer.parseInt(st.nextToken());
            valueArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 6; i++) {
            if (keyArr[i] == 3 || keyArr[i] == 4) {
                widthList.add(valueArr[i]);
            } else if (keyArr[i] == 1 || keyArr[i] == 2) {
                hightList.add(valueArr[i]);
            }
        }

        int totalWidth = Collections.max(widthList);
        int totalHight = Collections.max(hightList);
        int totalSize = totalHight * totalWidth;

        int subWidth = 0;
        int subHight = 0;
        for (int i = 0; i < 6; i++) {
            if (valueArr[i] == totalHight) {
                if (i == 0) {
                    subWidth = Math.abs(valueArr[5] - valueArr[i+1]);
                } else if (i == 5) {
                    subWidth = Math.abs(valueArr[i-1] - valueArr[0]);
                }else {
                    subWidth = Math.abs(valueArr[i-1] - valueArr[i+1]);
                }
            }
            if (valueArr[i] == totalWidth) {
                if (i == 0) {
                    subHight = Math.abs(valueArr[5] - valueArr[i+1]);
                } else if (i == 5) {
                    subHight = Math.abs(valueArr[i-1] - valueArr[0]);
                }else {
                    subHight = Math.abs(valueArr[i-1] - valueArr[i+1]);
                }
            }
        }

        int subSize = subWidth * subHight;

        int resultSize = totalSize - subSize;

        System.out.print(resultSize * k);
    }
}
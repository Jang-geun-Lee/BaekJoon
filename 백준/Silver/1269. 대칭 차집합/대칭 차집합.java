import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;

        HashSet<Integer> aHashSet = new HashSet<>();
        HashSet<Integer> bHashSet = new HashSet<>();
        CheckNum checkNum = new CheckNum();

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            aHashSet.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < m; i++) {
            bHashSet.add(Integer.parseInt(st.nextToken()));
        }

        count += checkNum.checkNumFunc(n, aHashSet, bHashSet);
        count += checkNum.checkNumFunc(m, bHashSet, aHashSet);

        System.out.print(count);
    }
}

class CheckNum {
    public int checkNumFunc(int count, HashSet aHashSet, HashSet bHashSet){
        Iterator bIterator = bHashSet.iterator();
        while(bIterator.hasNext()) {
            if(aHashSet.contains(bIterator.next())){
                count--;
            }
        }
        return count;
    }
}
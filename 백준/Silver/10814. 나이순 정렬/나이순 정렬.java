import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.io.IOException;
import java.util.StringTokenizer;

class Member{
    int age = 0;
    String name;
    Member(int age, String name){
        this.age = age;
        this.name = name;
    }
}

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        int n = Integer.parseInt(br.readLine());
        Member[] members = new Member[n];

        for(int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(stringTokenizer.nextToken());
            String name = stringTokenizer.nextToken();
            members[i] = new Member(age, name);
        }
        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.age - o2.age;
            }
        });

        for(int i = 0; i < n; i++){
            System.out.println(members[i].age + " " + members[i].name);
        }
    }
}
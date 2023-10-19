import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class JoinMember implements Comparable<JoinMember>{

    int joinNum;
    int age;
    String name;

    public JoinMember(int joinNum, int age, String name) {
        this.joinNum = joinNum;
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(JoinMember o) {
        if (this.age == o.age){
            return this.joinNum - o.joinNum;
        }else{
            return this.age - o.age;
        }
    }
}


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<JoinMember> joinMemberList = new ArrayList<>();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int joinNum = i;
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            joinMemberList.add(new JoinMember(joinNum, age, name));
        }
        br.close();

        Collections.sort(joinMemberList);

        for(JoinMember member : joinMemberList){
            System.out.println(member.age + " " + member.name);
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        int countA =0;
        int countB =0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int aInput = Integer.parseInt(st.nextToken());
            setA.add(aInput);
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            int bInput = Integer.parseInt(st.nextToken());
            setB.add(bInput);
            if (setA.contains(bInput)) {
                countA++;
            }
        }
        br.close();
        int output = setB.size() - countA;

        for(int i : setA){
            if (setB.contains(i)){
                countB++;
            }
        }
        output += setA.size() - countB;

        System.out.println(output);
    }
}

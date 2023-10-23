import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> have = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int input = Integer.parseInt(st.nextToken());

            if (have.containsKey(input)){
                int count = have.get(input);
                have.replace(input, count + 1);
            }else{
                have.put(input, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int j=0; j<m; j++){
            int validInput = Integer.parseInt(st.nextToken());
            if (have.containsKey(validInput)){
                sb.append(have.get(validInput));
            }else{
                sb.append("0");
            }
            sb.append(' ');
        }
        br.close();
        System.out.println(sb);
    }
}

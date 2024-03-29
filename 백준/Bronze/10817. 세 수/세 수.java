import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] set = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<set.length; i++){
            set[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(set);
        System.out.println(set[1]);
    }
}

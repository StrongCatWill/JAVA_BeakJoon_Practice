import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int max = 0;
        for(int i=0; i<4; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int minus = Integer.parseInt(st.nextToken());
            sum = sum - minus;
            int plus = Integer.parseInt(st.nextToken());
            sum +=plus;

            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}

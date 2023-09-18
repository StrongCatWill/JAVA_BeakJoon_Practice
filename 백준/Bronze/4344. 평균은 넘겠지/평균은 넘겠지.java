import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int input = Integer.parseInt(st.nextToken());
            int[] set = new int[input];
            int sum =0;

            for(int j=0; j<input; j++){
                set[j] = Integer.parseInt(st.nextToken());
                sum += set[j];
            }

            int count =0;
            for (int k=0; k<set.length; k++){
                if(set[k] > (double) sum/input){
                    count++;
                }
            }

            double percentage = ((double) count/input) * 100;
            System.out.printf("%.3f%%\n", percentage);
        }
    }
}

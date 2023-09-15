import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] input = new double[5];
        int i =0;
        double sum =0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()){
            input[i] = Double.parseDouble(st.nextToken());
            sum += Math.pow(input[i], 2);
            i++;
        }
        int output = (int) (sum % 10);
        System.out.println(output);
    }
}

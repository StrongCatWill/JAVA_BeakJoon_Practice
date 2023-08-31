import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        String arr = br.readLine();

        for(int i=0; i<n; i++){
            int input = Integer.parseInt(String.valueOf(arr.charAt(i)));
            sum += input;
        }
        System.out.println(sum);
    }
}
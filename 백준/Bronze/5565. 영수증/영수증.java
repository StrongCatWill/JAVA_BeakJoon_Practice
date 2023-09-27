import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = new int[10];
        int sum = 0;
        for(int i=0; i<input.length; i++){
            input[i] = Integer.parseInt(br.readLine());
            sum += input[i];
        }
        int output = (input[0]*2) - sum;

        System.out.println(output);
    }
}

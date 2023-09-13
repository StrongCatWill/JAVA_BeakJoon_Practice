import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = new int[3];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<input.length; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(input);
        if(input[2] < input[0] + input[1]){
            System.out.println(input[2] + input[0] + input[1]);
        }else{
            System.out.println((input[0] + input[1]) * 2 -1);
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size = Integer.parseInt(st.nextToken());
        int cut = Integer.parseInt(st.nextToken());

        int[] input = new int[size];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i < size; i++){

            input[i] = Integer.parseInt(st.nextToken());

        }

        Arrays.sort(input);
        System.out.println(input[size-cut]);
    }
}


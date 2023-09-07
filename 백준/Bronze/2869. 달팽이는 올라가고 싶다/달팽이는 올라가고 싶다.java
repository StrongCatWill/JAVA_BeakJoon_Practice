import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int up = Integer.parseInt(String.valueOf(st.nextToken()));
        int down = Integer.parseInt(String.valueOf(st.nextToken()));
        int length = Integer.parseInt(String.valueOf(st.nextToken()));

        int output = (length - down) / (up - down);
        if((length - down) % (up - down) !=0){
            output++;
        }
        System.out.println(output);
    }
}

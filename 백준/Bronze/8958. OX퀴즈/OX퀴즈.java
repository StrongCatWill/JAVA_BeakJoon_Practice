import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();

            int count = 0;
            int sum = 0;

            for(int j=0; j<input.length(); j++){
                if(input.charAt(j) == 'O'){
                    count++;
                }else{
                    count = 0;
                }
                sum +=count;
            }
            System.out.println(sum);
        }
    }
}

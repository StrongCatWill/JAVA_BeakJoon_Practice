import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int start = 0;
        int last = input.length()-1;

        for(int i=0; i<input.length(); i++){
            while(start<=last){
                if(input.charAt(start)!=input.charAt(last)) {
                    System.out.println(0);
                    return;
                }
                start++;
                last--;
            }
            if(i==input.length()-1){
                System.out.println(1);
            }
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();

        Set<String> output = new HashSet<>();

        for(int len=1; len<input.length(); len++){
            for(int i=0; i+len <= input.length(); i++){
                String temp = input.substring(i, i + len);
                output.add(temp);
            }
        }


        System.out.println(output.size()+1);
    }
}

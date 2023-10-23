import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> setUpList = new HashSet<>();
        for(int i=0; i<n; i++){
            setUpList.add(br.readLine());
        }

        ArrayList<String> output = new ArrayList<>();

        for(int j=0; j<m; j++){
            String validInput = br.readLine();
            if(setUpList.contains(validInput)){
                output.add(validInput);
            }
        }

        Collections.sort(output);

        System.out.println(output.size());
        for(String s : output){
            System.out.println(s);
        }
    }
}

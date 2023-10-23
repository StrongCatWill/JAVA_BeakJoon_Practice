import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, String> log = new HashMap<>();

        for(int i=0; i<n; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();

            if(log.containsKey(name)){
                log.remove(name);
            }else{
                log.put(name, state);
            }

        }
        br.close();

        List<String> keyList = new ArrayList<String>(log.keySet());

        Collections.sort(keyList, Collections.reverseOrder());
        for(String i : keyList){
            System.out.println(i);
        }
    }

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> dictionary = new HashMap<>();
        String[] nameArr = new String[n + 1];

        for(int i=1; i<=n; i++){
            String name = br.readLine();
            dictionary.put(name, i);
            nameArr[i] = name;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            String input = br.readLine();
            if (isStringOrNumber(input)){   //int
                int index = Integer.parseInt(input);
                sb.append(nameArr[index]);
            }else{  //문자
                sb.append(dictionary.get(input));
            }
            sb.append('\n');
        }

        br.close();
        System.out.println(sb);
    }

    public static boolean isStringOrNumber(String s){
        try{
            Double.parseDouble(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}

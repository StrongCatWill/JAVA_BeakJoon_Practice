import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Map<String, Integer> inputMap = new HashMap<>();

        //get key and value
        for(int i=0; i<t; i++){
            String input = br.readLine();
            int lastIndex = input.lastIndexOf(".");
            if (lastIndex >=0){
                String extentionSub = input.substring(lastIndex + 1);
                inputMap.put(extentionSub, inputMap.getOrDefault(extentionSub, 0) + 1);
            }
        }
        br.close();

        //sort
        Map<String, Integer> sortedMap = new TreeMap<>(inputMap);

        //print
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, Integer> entry : sortedMap.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            sb.append(key).append(' ').append(value).append('\n');
        }
        System.out.println(sb);
    }

}

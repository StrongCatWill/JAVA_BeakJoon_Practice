import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        Map<Long, Integer> integerIntegerMap = new HashMap<>();
        int max = 0;

        for(int i=0; i<n; i++){
            long input = Long.parseLong(br.readLine());
            integerIntegerMap.put(input, integerIntegerMap.getOrDefault(input, 0)+1);
            max = Math.max(max, integerIntegerMap.get(input));
        }

        List<Long> list = new ArrayList<>();

        for(Map.Entry<Long, Integer> entry : integerIntegerMap.entrySet()){
            if(entry.getValue()==max){
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);
        System.out.println(list.get(0));
    }
}

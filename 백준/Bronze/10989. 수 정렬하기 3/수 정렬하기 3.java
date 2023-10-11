import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i=0; i<n; i++){
            int input = Integer.parseInt(br.readLine());
            if (count.containsKey(input)){
                count.put(input, count.get(input) +1 );
            }else{
                list.add(input);
                count.put(input, 1);
            }
        }
        br.close();

        Collections.sort(list);
        Iterator iter = list.iterator();

        while(iter.hasNext()){
            int number = (int) iter.next();
            int numberNum = count.get(number);

            for(int i=0; i< numberNum; i++){
                bw.write(Integer.toString(number) + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}

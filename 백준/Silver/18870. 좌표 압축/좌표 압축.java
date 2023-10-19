import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] origin = new int[n];
        int[] sorted = new int[n];

        HashMap<Integer, Integer> rank = new HashMap<Integer, Integer>();

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            //저장할 때 한번에 같이 넣어버림.
            sorted[i] = origin[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        br.close();

        Arrays.sort(sorted);

        //정렬 된 배열을 순회하면서 map에 넣어줌
        int ranking = 0;
        for(int v : sorted){
            /*
            * 앞서 정렬된 원소에 이미 순위가 들어가는 것은 뮤트하고
            * 원소가 중복되지 않을 때만 map에 원소와 그에 대응되는 순위를 넣어줌.
            */

            if(!rank.containsKey(v)){
                rank.put(v, ranking);
                ranking++;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int key : origin){
            //원본 배열 원소 (key)에 대한 value(순위)를 가져옴.
            int output = rank.get(key);
            stringBuilder.append(output).append(' ');
        }
        System.out.println(stringBuilder);
    }
}

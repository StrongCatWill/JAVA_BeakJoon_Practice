import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        int[][] input = new int[5][4];
        int[] sum = new int[5];

        //입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<5; i++){
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, " ");
            for(int j=0; j<4; j++){
                input[i][j] = Integer.parseInt(st.nextToken());
                sum[i] += input[i][j];
            }
        }
        int max = 0;
        int maxIdx = 0;
        for (int i=0; i<sum.length; i++){
            if(sum[i] > max){
                max = sum[i];
                maxIdx =i;
            }
        }
        System.out.println(maxIdx+1 + " " + max);
    }
}

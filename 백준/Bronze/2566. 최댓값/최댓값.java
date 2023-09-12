import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] set = new int[9][9];

        //출력에 사용할 거 초기화
        int max = 0;
        int[] address = new int[2];

        //배열 값 할당받으면서 최댓값 넣기
        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<9; j++){
                set[i][j] = Integer.parseInt(st.nextToken());
                if(set[i][j] > max){
                    max = set[i][j];
                    address = new int[]{i, j};
                }
            }
        }
        
        //출력
        System.out.println(max);
        for(int i=0; i<address.length; i++){
            System.out.print(address[i]+1 + " ");
        }
    }
}

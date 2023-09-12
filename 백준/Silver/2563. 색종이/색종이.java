import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] set = new boolean[100][100];
        int t = Integer.parseInt(br.readLine());

        //x번 만큼 반복해서 색종이 입력 받기
        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j=x; j<x+10; j++){
                for(int k=y; k<y+10; k++){
                    set[j][k] = true;
                }
            }
        }

        //카운트
        int count = 0;
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if (set[i][j]) count++;
            }
        }

        System.out.println(count);
    }
}

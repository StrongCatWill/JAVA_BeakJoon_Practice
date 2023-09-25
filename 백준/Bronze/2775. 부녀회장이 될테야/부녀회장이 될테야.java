import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[][] apt = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        makeAPT();

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            sb.append(apt[k][n]).append('\n');
        }
        System.out.println(sb);
    }


    public static void makeAPT() {
        for (int i = 0; i < 15; i++) {
            apt[i][1] = 1;      //k부터 들어오니까 세로 축을 먼저 만들고,
            apt[0][i] = i;      //n은 0층이 i호를 초기화.
        }

        for (int i = 1; i < 15; i++) {        //1층부터 14층까지
            for (int j = 2; j < 15; j++) {    //2호부터 14호까지
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }
    }
}

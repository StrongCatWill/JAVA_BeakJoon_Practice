import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(String.valueOf(br.readLine()));


        //테스트 케이스 반복
        for(int i=0; i<t; i++){

            //입력 받기 :: 새 값을 입력받을 때
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            int a = Integer.parseInt(st.nextToken());
            String input = st.nextToken();

            //앞글자부터 담기
            for(int j=0; j<input.length(); j++){
                char s = input.charAt(j);
                
                //반복 횟수만큼 sb에 붙이기
                for(int k =0; k<a; k++){
                    sb.append(s);
                }
            }
            System.out.println(sb);
        }
    }
}

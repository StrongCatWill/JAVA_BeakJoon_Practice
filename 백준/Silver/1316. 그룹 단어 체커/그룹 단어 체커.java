import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(String.valueOf(br.readLine()));

        //방문만 확인하면 됨, 알파벳 글자 수 만큼 논리형 배열 선언
        boolean set[] = new boolean[26];
        
        //출력에 사용할 친구
        int count = 0;
        for(int i=0; i<t; i++){

            //입력 받기
            String input = br.readLine().toLowerCase();
            boolean isGroup = true;

            for(int j=0; j<input.length(); j++){
                char current = input.charAt(j);

                //지금 검사하는 문자가 예전에 한 번 나왔으면서 직전 문자와 다르면 그룹 단어가 아님
                if (set[current - 'a'] && current != input.charAt(j - 1)) {
                    isGroup = false;
                    break;
                }

                //지금 검사하는 문자는 방문했다고 표기
                set[current - 'a'] = true;
            }
            if(isGroup){
                count++;
            }
            //다음 단어를 검사하기 전에 방문 배열 초기화
            for(int k=0; k<set.length; k++){
                set[k] = false;
            }
        }
        System.out.println(count);
    }
}
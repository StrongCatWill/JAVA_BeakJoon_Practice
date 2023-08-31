import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //입력 받아서 전부 소문자로 바꿔버리기
        String input = br.readLine().toLowerCase();

        //알파벳 자리수만큼 정부 배열 선언해두기
        int[] set = new int[26];

        //알파벳이 등장하는 자리를 set에다가 넣어주기
        for(int i=0; i<input.length(); i++){
            int place = input.charAt(i) - 'a';
            //중복 처리
            if(set[place]==0){
                set[place] = i;
                if(i==0){
                    set[place] = -4;
                }
            }
        }

        //set에서 빈 공간(즉 0 초기화 그 상태)면 -1로 바꿔주고 그대로 출력
        for(int i=0; i<set.length; i++){
            if (set[i] == 0){
                //근데 첫번째 나와서 0으로 들어간 걸 수도 있음.
                set[i] = -1;
            }
            if (set[i] == -4){
                set[i] = 0;
            }
            System.out.print(set[i] + " ");
        }
    }
}

import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        HashSet<String> inputSet = new HashSet<>();
        int count =0;

        for(int i=0; i<t; i++){
            String input = br.readLine();
            if (input.equals("ENTER")){
                count += inputSet.size(); //기존에 저장된 유저의 닉네임 중복제거한 개수를 누적 더하기
                inputSet.clear();
                continue;
            }else{
                inputSet.add(input);
            }
        }
        br.close();
        count += inputSet.size();
        System.out.println(count);

    }
}


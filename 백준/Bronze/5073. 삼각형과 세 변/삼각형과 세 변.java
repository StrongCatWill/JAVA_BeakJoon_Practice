import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = new int[3];
        boolean stop = true;

        while(stop){
            //입력 받기
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<input.length; i++){
                input[i] = Integer.parseInt(st.nextToken());
            }
            if(input[0] == 0){
                stop = false;
            }else {
                Arrays.sort(input);

                if(input[2] >= input[0]+input[1]){
                    System.out.println("Invalid");
                }else{
                    if((input[0] == input[1]) && (input[1] == input[2])){
                        System.out.println("Equilateral");
                    }else if ((input[0] == input[1]) || (input[1] == input[2]) || (input[0] == input[2])){
                        System.out.println("Isosceles");
                    }else {
                        System.out.println("Scalene");
                    }
                }
            }

        }
    }
}

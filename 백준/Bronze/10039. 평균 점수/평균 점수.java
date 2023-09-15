import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum =0;
        int[] score = new int[5];
        for(int i=0; i<score.length; i++){
            score[i] = Integer.parseInt(br.readLine());
            if(score[i] < 40){
                score[i] = 40;
            }
            sum += score[i];
        }
        System.out.println(sum/5);
    }
}

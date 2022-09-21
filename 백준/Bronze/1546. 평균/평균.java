import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException, NumberFormatException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double score[] = new double[Integer.parseInt(br.readLine())];          
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");    

        for(int i=0; i<score.length; i++){
            score[i] = Double.parseDouble(st.nextToken());
        }
        double sum = 0;
        Arrays.sort(score);

        for(int i=0; i<score.length;i++){
            sum +=(score[i]/score[score.length-1])*100;
        }
        System.out.println(sum/score.length);
    }
}

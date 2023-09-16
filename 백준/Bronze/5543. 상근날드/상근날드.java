import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] meal = new int[3];
        int[] drink = new int[2];

        for(int i =0; i<meal.length; i++){
            meal[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(meal);

        for(int j =0; j< drink.length; j++){
            drink[j] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(drink);

        System.out.println(meal[0] + drink[0] - 50);
    }
}

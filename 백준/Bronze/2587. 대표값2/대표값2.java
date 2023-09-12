import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = new int[5];
        int sum = 0;
        for(int i=0; i<input.length; i++){
            input[i] = sc.nextInt();
            sum += input[i];
        }
        sc.close();

        Arrays.sort(input);
        System.out.println(sum / input.length);
        System.out.println(input[2]);
    }
}

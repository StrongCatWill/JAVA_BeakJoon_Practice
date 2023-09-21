import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        String[] inputs = br.readLine().split(" ");

        for(int i=0; i<n; i++){
            int input = Integer.parseInt(inputs[i]);
            if(isPrime(input)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i =2; i < num; i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }
}

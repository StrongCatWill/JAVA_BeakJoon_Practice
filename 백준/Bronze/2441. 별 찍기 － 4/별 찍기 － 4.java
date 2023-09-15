import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        for(int i=0; i<input; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=input; k>i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] known = new int[5];

        int a = sc.nextInt();
        int b = sc.nextInt();

        int real = a*b;

        for(int i=0; i<known.length; i++){
            known[i] = sc.nextInt();
        }
        sc.close();

        for(int i:known){
            System.out.print(i - real + " ");
        }
    }
}

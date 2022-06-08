import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int i; int j; int k;

        for(i=1; i<=N; i++) { //세로 줄이 외부 for문인 건 똑같음.
            for(j=1;j<=N-i;j++) {
                System.out.print(" ");
            }for(k=1;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
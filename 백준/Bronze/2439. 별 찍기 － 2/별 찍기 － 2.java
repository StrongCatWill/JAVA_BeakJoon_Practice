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

/*
Sol. 
file:///C:/Users/SEUNGY~1/AppData/Local/Temp/BNZ.62a09d1c142f45d6/2439%EB%B2%88%20%EB%B3%84%20%EC%B0%8D%EA%B8%B0%20-2%20915e05bedba4446ab0549dc4d1ad9f06.html
*/

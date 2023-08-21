import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        //윗부분
        for(int i=1; i<=n; i++){
            //공백 출력
            for(int k=n-i; k>0; k--){
                System.out.print(" ");
            }
            //별 출력
            for(int j=1 ;j<=i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //아랫부분
        for(int i=n-1; i>=0 ;i--){
            //공백 출력
            for(int k=0; k<n-i; k++){
                System.out.print(" ");
            }
            //별 출력
            for(int j=i*2-1; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
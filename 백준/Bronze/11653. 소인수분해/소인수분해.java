import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        for(int i =2; i<=Math.sqrt(n); i++){    //2부터 n의 제곱근까지 수행
            while(n % i ==0){                   //n을 i로 나눌 수 있을 때까지 반복하여 나눔. 
                sb.append(i).append('\n');
                n /= i;
            }
        }

        if(n != 1){
            sb.append(n);
        }
        System.out.println(sb);
    }
}

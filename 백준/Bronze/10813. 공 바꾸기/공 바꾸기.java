import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int out[] = new int[N];

        //배열 바구니 할당
        for(int i=0; i<N; i++){
            out[i] = i+1;
        }
        //공 바꾸기
        for(int i=0;i<M;i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
                 //먼저 저장해두기
                 int temp = out[b];     //2,1의 경우 1 저장
                 out[b] = out[a];       //2번에 1번 저장
                 //1번에 2번 저장
                 out[a] = temp;
        }
        sc.close();
        //출력
        for(int i=0; i<N; i++){
            System.out.print(out[i] + " ");
        }
    }
}

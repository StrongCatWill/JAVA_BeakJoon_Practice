import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /* 좋은 메소드 알아갑니다~
        Returns true if the next token in this scanner's input can be interpreted as an int value in the default
        radix using the nextInt method. The scanner does not advance past any input.*/
        while(scanner.hasNextInt()){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            //hasNextInt 썼기 때문에 따로 if문으로 아웃 처리 안 해줘도 된다. 들어오는 nextLine이 Int가 아니면 바로 종료되기 때문에.
            System.out.println(A+B);
        }
        scanner.close();
    }
}
//와 진짜 빠르다~!

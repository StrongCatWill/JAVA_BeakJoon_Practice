import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //문자열로 입력 받기
        String input = sc.nextLine();
        //띄어쓰기로 나눠서 문자열 배열에 저장하기
        String[] splitArray = input.split(" ");
        //저장할 정수 배열 선언해두기
        int[] ar = new int[6];
        //문자열로 받은 입력값 정수 배열로 할당해두기
        for(int i=0; i<splitArray.length; i++){
            ar[i] = Integer.parseInt(splitArray[i]);
        }

        //배교할 값
        int[] set = {1,1,2,2,2,8};

        //출력 값 초기화
        int[] output = new int[6];

        for(int i=0; i<set.length; i++){
            output[i] = set[i] - ar[i];
        }

        for(int i=0;i<output.length;i++){
            System.out.print(output[i] + " ");
        }
    }
}

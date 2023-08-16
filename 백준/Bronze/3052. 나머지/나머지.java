import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input[] = new int[10];
        int rest[] = new int[10];

        //초기 입력 값 받기, 나머지 값 할당하기
        for(int i=0; i<10; i++){
            input[i] = sc.nextInt();
            rest[i] = input[i]%42;
        }
        sc.close();

        //다른 나머지 값 몇 개 있는지 비교하기.
        int count = 0;

        for(int i=0; i<10; i++){
            boolean isUnique = true;
            for(int j= i+1; j<10; j++){
                if(rest[i]==rest[j]){
                    isUnique = false;
                    break;
                }
            }
            //현재 나머지 값과 이전의 나머지 값들을 모두 비교해도 중복된 값이 발견되지 않았다면, isUnique는 여전히 true로 유지
            if(isUnique){
                count++;
            }
        }

        System.out.println(count);
    }
}

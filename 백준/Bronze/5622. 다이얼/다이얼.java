import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //입력 받고 스캐너 닫아줌
        String input = sc.nextLine().toUpperCase();
        sc.close();

        //다이얼대로 배열 세팅. 문제에서 1을 걸려면 2초가 걸린다고 했으니까 출력과 인덱스를 맞춰주기 위해서 앞뒤로 0 넣어줌.
        String set[] = {"0", "0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", "0"};

        //출력할 카운트 선언
        int count =0;

        //입력받은 거 하나씩 떼서 검사할 반복문(큰 틀)
        for(int i=0; i<input.length(); i++){

            //검사 대상
            char x = input.charAt(i);

            for(int j=0; j<set.length; j++){
                //set 배열 안에 있는 문자열 안에서도 검사해야 함.
                String y = set[j];

                //set 배열을 하나씩 떼고, j인덱스의 string의 k번째 글짜와 x가 같으면 count에 j(set의 인덱스)를 더해줌.
                for(int k =0; k<y.length(); k++){
                    if(y.charAt(k) == x){
                        count +=j;
                    }
                }
            }
        }
        System.out.println(count);
    }
}

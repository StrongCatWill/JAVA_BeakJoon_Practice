import java.util.Scanner;
public class Main {

    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       
       while(true){ //while(true)가 무슨 값에 대한 true인지 몰라 아래 if문을 true로 두고 사용했었다.
           //while 자체 성질은 무한 반복문이므로 반복변수가 따로 정해지지 않았을 때 사용하면 좋음. 
           int A= scanner.nextInt();
           int B= scanner.nextInt();

           if(A==0&&B==0){
               scanner.close();
               break;
           }
           System.out.println(A+B);
       }
    }
}

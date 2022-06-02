import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		for(int i=1; i<=T;i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(0<A&&B<10) {
				System.out.println("Case #"+i+": "+(A+B));
			}else {
				System.out.println("0<A&&B<10 안에서 A, B 입력.");
				i--;
			}
		}
		sc.close();
	}
}

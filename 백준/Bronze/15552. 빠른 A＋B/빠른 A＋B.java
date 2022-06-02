import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//sysout에서도 매일 쓰는 그 아웃. 받아내는 걸 시스템 인.
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine()); //테스트 유형.
		
		//공백으로 구분하려고 StringTokenizer 삽입. 
		
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine());
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		bw.close();
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] a = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        //줄바꿈에 대한 토크나이저 처리, 새 줄에서 계산될 테니까 새로 선언한다.
        st = new StringTokenizer(br.readLine(), " ");

        int[] b = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine(), " ");

        int[] c = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        int x;
        int y;

        //x좌표값 만들기.
        if(a[0]==b[0])
            x = c[0];
        else if (a[0] == c[0])
            x = b[0];
        else x = a[0];

        //y좌표값 만들기.
        if(a[1]==b[1])
            y = c[1];
        else if (a[1] == c[1])
            y = b[1];
        else y = a[1];

        System.out.print(x + " "+ y);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();

    //크로아이티아 알파벳 들어오는 거 먼저 세팅. 순회하면서 하나씩 돌아가면 됨.
    String set[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    int count = 0;

    for (String s : set){
        input = input.replace(s, "a");
    }
    System.out.println(input.length());
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] xSet = new int[n];
        int[] ySet = new int[n];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            xSet[i] = Integer.parseInt(String.valueOf(st.nextToken()));
            ySet[i] = Integer.parseInt(String.valueOf(st.nextToken()));
        }

        Arrays.sort(xSet);
        Arrays.sort(ySet);

        int x = xSet[xSet.length -1] - xSet[0];
        int y = ySet[ySet.length-1] - ySet[0];
        
        System.out.println(x*y);
    }
}

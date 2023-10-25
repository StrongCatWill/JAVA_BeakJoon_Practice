import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> pw = new HashMap();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String sitePw = st.nextToken();
            pw.put(site, sitePw);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            String searchSite = br.readLine();
            if (pw.containsKey(searchSite)){
                sb.append(pw.get(searchSite)).append('\n');
            }
        }
        br.close();
        System.out.println(sb);
    }
}

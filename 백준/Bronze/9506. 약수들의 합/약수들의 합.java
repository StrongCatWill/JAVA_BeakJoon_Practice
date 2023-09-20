import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int sum =0;
            int input = Integer.parseInt(br.readLine());
            ArrayList<Integer> measure = new ArrayList<>();

            if (input == -1) break;

            for(int i=1; i<input; i++){
                if (input % i ==0){
                    measure.add(i);
                }
            }

            for(int j =0; j<measure.size(); j++){
                sum += measure.get(j);
            }

            if (sum == input){
                System.out.print(input + " = ");
                for(int j=0; j<measure.size(); j++){
                    if (j != measure.size() -1){
                        System.out.print(measure.get(j) + " + ");
                    }else{
                        System.out.println(measure.get(j));
                    }
                }
            }else{
                System.out.println(input + " is NOT perfect.");
            }
        }
    }
}

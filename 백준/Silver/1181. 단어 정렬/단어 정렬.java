import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class inputString implements Comparable<inputString>{
    String inputArr;

    public inputString(String inputArr) {
        this.inputArr = inputArr;
    }

    @Override
    public int compareTo(inputString o) {
        if(this.inputArr.length() == o.inputArr.length()){
            //chatGPT가 제시해준 코드.
            //두 문자열의 길이가 같을 때, 문자열 자체를 비교하여 중복을 제거.
            return this.inputArr.compareTo(o.inputArr);
//            return this.inputArr.charAt(0) - 'a' - o.inputArr.length() - 'a';
        }else{
            return this.inputArr.length() - o.inputArr.length();
        }
    }

    @Override
    public int hashCode(){
        //해시코드 문자열의 길이로 설정하여 중복 검사를 빠르게 할 수 있도록.
        return this.inputArr.length();
    }

    @Override
    public boolean equals(Object obj){
        //두 문자열의 길이가 같을 때, 문자열 자체를 비교하여 중복을 처리
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        inputString other = (inputString) obj;
        return this.inputArr.length() == other.inputArr.length() && this.inputArr.equals(other.inputArr);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<inputString> inputStringList = new HashSet<>();

        for(int i=0; i<n; i++){
            String input = br.readLine();

            inputStringList.add(new inputString(input));
        }

        List<inputString> sortetdList = new ArrayList<>(inputStringList);
        Collections.sort(sortetdList);

        for(inputString inputString : sortetdList){
            System.out.println(inputString.inputArr);
        }
    }
}

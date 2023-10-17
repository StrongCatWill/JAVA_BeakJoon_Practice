import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //사용자로부터 배열 입력 받기
        String inputString = br.readLine();
        int n = inputString.length();
        int[] inputArray = new int[n];
        for(int i=0; i<n; i++){
            inputArray[i] = Integer.parseInt(String.valueOf(inputString.charAt(i)));
        }
        br.close();

        /*
        * 이 문제의 핵심은 내림차순으로 정렬하는 것.
        * */

        //QuickSort 클래스의 인스턴스 생성 및 배열 정렬
        Main quickSort = new Main();
        quickSort.quickSort(inputArray, 0, inputArray.length-1);

        StringBuilder stringBuilder = new StringBuilder();
        //정렬된 배열 출력
        for(int i : inputArray){
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder.reverse());
    }
    /*
     * @Parameter 정렬 시킬 배열과 최소 최대 인덱스(low, high index)
     * */
    public void quickSort(int[] inputArray, int low, int high) {

        //배열의 크기가 1보다 큰 경우
        if(low < high){
            //배열을 분할하여 pivot의 위치를 반환
            int pivot = partition(inputArray, low, high);

            //pivot을 기준으로 좌측과 우측 배열에 대해 재귀 호출
            quickSort(inputArray, low, pivot - 1);
            quickSort(inputArray, pivot+1, high);
        }
    }

    private int partition(int[] inputArray, int low, int high){
        //배열의 마지막 요소를 pivot으로 설정
        int pivot = inputArray[high];
        int i = low - 1;

        //배열의 처음부터 마지막 요소 전까지 반복.
        for(int j=low; j<high; j++){
            if(inputArray[j] <=pivot){
                i++;
                //pivot 보다 작은 요소를 좌측으로 이동
                swap(inputArray, i, j);
            }
        }
        swap(inputArray, i + 1, high);
        return i + 1;
    }

    private void swap(int[] inputArray, int i, int j) {
        int temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }
}

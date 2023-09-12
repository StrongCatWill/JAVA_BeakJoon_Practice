import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] grade = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double[] score = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0}; // P의 점수는 0.0으로 설정
        double sum = 0.0;
        double x = 0.0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            String input = br.readLine();
            String inputArray[] = input.split(" ");
            String inputGrade = inputArray[inputArray.length - 1];
            double inputScore = Double.parseDouble(inputArray[inputArray.length - 2]);

            for (int j = 0; j < grade.length; j++) {
                if (inputGrade.equals(grade[j])) {
                    sum += score[j] * inputScore;
                    if (!inputGrade.equals("P")) { // P의 경우 학점에 포함되지 않으므로 x에 더하지 않음
                        x += inputScore;
                    }
                    break;
                }
            }
        }
        double average = sum / x;
        System.out.println(average);
    }
}

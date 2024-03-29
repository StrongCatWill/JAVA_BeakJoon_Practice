import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.close();

        int dot = 4;
        double base = 0;

        for(int i =0; i<count; i++){
            base = Math.sqrt(dot);
            dot = (int) Math.pow((base + (base-1)), 2);
        }
        System.out.print(dot);
    }
}
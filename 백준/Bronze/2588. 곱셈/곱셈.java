import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nextLine = sc.nextLine();
        int a = Integer.parseInt(String.valueOf(nextLine));
        String input = sc.nextLine();
        sc.close();

        int first = Integer.parseInt(String.valueOf(input.charAt(2)));
        int second = Integer.parseInt(String.valueOf(input.charAt(1)));
        int third = Integer.parseInt(String.valueOf(input.charAt(0)));

        System.out.println(a*first);
        System.out.println(a*second);
        System.out.println(a*third);
        System.out.println(a*Integer.parseInt(String.valueOf(input)));
    }
}

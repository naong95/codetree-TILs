import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int mathA = sc.nextInt();
        int englA = sc.nextInt();
        int mathB = sc.nextInt();
        int englB = sc.nextInt();

        if(mathA == mathB) {
            System.out.println((englA > englB) ? "A" : "B");
        } else {
            System.out.println((mathA > mathB) ? "A" : "B");
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int mathA = sc.nextInt();
        int englA = sc.nextInt();

        int mathB = sc.nextInt();
        int englB = sc.nextInt();

        System.out.println((mathA > mathB && englA > englB) ? 1 : 0);
        
    }
}
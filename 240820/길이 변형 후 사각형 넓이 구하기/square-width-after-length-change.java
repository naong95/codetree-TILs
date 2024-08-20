import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int garo = sc.nextInt() + 8;
        int sero = sc.nextInt() * 3;

        System.out.println(garo + "\n" + sero + "\n" + (garo * sero));
    }
}
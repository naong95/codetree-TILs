import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int gen = sc.nextInt();
        int age = sc.nextInt();

        if(gen == 0) {
            System.out.println((age < 19) ? "BOY" : "MAN");
        } else {
            System.out.println((age < 19) ? "GIRL" : "WOMAN");
        }
    }
}
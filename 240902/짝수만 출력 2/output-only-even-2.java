import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("");

        int b = sc.nextInt();
        int a = sc.nextInt();

        while(b >= a) {
            sb.append(b).append(" ");
            b -= 2;
        }

        System.out.println(sb.toString());
    }
}
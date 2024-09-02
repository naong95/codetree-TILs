import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("");

        int a = sc.nextInt();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            a += n;
            sb.append(a).append("\n");
        }

        System.out.println(sb.toString());
    }
}
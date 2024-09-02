import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("");

        int n = sc.nextInt();
        int a = 1;

        while(a <= n) {
            if(a % 3 != 0) {
                a++;
                continue;
            }

            sb.append(a).append(" ");
            a += 3;
        }

        System.out.println(sb.toString());
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("");

        int a = sc.nextInt();
        int b = sc.nextInt();

        while(a <= b) {
            if((a & 1) == 1) {
                a++;
                continue;
            }

            sb.append(a).append(" ");
            a += 2;
        }

        System.out.println(sb.toString());
    }
}
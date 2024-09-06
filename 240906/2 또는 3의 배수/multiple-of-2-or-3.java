import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder("");

        for(int i = 1; i < n + 1; i++) {
            if(i % 2 == 0 || i % 3 == 0) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}
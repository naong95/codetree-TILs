import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("");

        int n = sc.nextInt();
        int num = -1;

        for(int i = 0; i < n; i++) {
            num = sc.nextInt();
            if(num % 2 == 1 && num % 3 == 0) {
                sb.append(num).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
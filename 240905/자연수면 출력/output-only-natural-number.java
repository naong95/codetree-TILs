import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder("");

        if(a > 0) {
            for(int i = 0; i < b; i++) {
                sb.append(a);
            }
        } else {
            sb.append(0);
        }

        System.out.println(sb.toString());
    }
}
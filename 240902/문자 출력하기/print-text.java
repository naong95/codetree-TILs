import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("");

        String str = sc.next();

        for(int i = 0; i < 8; i++) {
            sb.append(str);
        }

        System.out.println(sb.toString());
    }
}
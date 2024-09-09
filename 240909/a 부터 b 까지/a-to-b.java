import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("");

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a; i < b + 1; i++) {
            sb.append(i).append(" ");

            if(i % 2 == 0) {
                i += 2;
            } else {
                i = i * 2 - 1;
            }
        }

        System.out.println(sb.toString());
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        int num = -1;

        for(int i = 0; i < 5; i++) {
            num = sc.nextInt();
            if(num % 2 == 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
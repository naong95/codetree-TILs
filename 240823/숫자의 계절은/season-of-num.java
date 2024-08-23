import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        if(3 <= m && m < 6) {
            System.out.println("Spring");
        } else if(6 <= m && m < 9) {
            System.out.println("Summer");
        } else if(9 <= m && m < 12) {
            System.out.println("Fall");
        } else {
            System.out.println("Winter");
        }
    }
}
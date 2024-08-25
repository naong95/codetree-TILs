import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        boolean tf = true;

        if(y % 4 == 0) {
            if(y % 100 == 0 && y % 400 != 0) {
                tf = false;
                System.out.println(tf);
            } else {
                System.out.println(tf);
            }
        } else {
            tf = false;
            System.out.println(tf);
        }
    }
}
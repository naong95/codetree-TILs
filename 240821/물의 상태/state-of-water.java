import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n >= 100) {
            System.out.println("vapor");
        } else if(n >= 0) {
            System.out.println("water");
        } else {
            System.out.println("ice");
        }
    }
}
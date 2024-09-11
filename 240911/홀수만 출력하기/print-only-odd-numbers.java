import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("");

        int n = -1;

        while(sc.hasNext()) {
            n = sc.nextInt();
            if(n % 2 == 1 && n % 3 == 0) {
                sb.append(n).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
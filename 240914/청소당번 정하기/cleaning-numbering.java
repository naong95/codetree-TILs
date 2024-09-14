import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");

        int n = sc.nextInt();

        int gyo = 0;
        int bok = 0;
        int hwa = 0;

        for(int i = 1; i < n + 1; i++) {
            if(i % 12 == 0) {
                hwa++;
            } else if(i % 3 == 0) {
                bok++;
            } else if(i % 2 == 0) {
                gyo++;
            }
        }

        sb.append(gyo).append(" ").append(bok).append(" ").append(hwa);

        System.out.println(sb.toString());
    }
}
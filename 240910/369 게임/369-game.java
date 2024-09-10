import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("");

        int n = sc.nextInt();
        String str = "";

        for(int i = 1; i < n + 1; i++) {
            str = Integer.toString(i);
            if(i % 3 == 0 || str.contains("3") || str.contains("6") || str.contains("9")) {
                sb.append(0).append(" ");
            } else {
                sb.append(i).append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}
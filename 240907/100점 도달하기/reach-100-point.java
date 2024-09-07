import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("");

        int n = sc.nextInt();

        for(int i = n; i < 101; i++) {
            if(i > 89) {
                sb.append("A").append(" ");
            } else if(i > 79) {
                sb.append("B").append(" ");
            } else if(i > 69) {
                sb.append("C").append(" ");
            } else if(i > 59) {
                sb.append("D").append(" ");
            } else {
                sb.append("F").append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}
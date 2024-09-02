public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        StringBuilder sb = new StringBuilder("");

        int n = 10;
        while(n < 27) {
            sb.append(n).append(" ");
            n++;
        }

        System.out.println(sb.toString());
    }
}
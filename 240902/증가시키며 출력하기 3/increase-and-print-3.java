public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = 10;

        StringBuilder sb = new StringBuilder("");

        while(n < 27) {
            sb.append(n).append(" ");
            n += 2;
        }

        System.out.println(sb.toString());
    }
}
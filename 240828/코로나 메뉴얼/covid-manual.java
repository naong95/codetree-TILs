import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String gamgi = "";
        int cheon = -1;
        int check = 0;

        for(int i = 0; i < 3; i++) {
            gamgi = sc.next();
            cheon = sc.nextInt();

            if(gamgi.equals("Y")) {
                if(cheon >= 37) {
                    check++;
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }

        System.out.println((check >= 2) ? "E" : "N");
    }
}
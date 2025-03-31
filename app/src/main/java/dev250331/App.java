package dev250331;
import java.util.Scanner;

public class App {

    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== motivation 실행 ==");

        int LastId = 1;

        while (true) {
            System.out.print("명령어)");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("exit")) {
                System.out.println("== motivation 종료 ==");
                break;
            } else if (cmd.length() == 0) {
                System.out.println("명령어가 입력되지 않았습니다. 입력해주세요");
            }

            if (cmd.equals("add")) {
                System.out.println("motivation : ");
                String motivation = sc.nextLine();
                System.out.println("source : ");
                String source = sc.nextLine();
                System.out.printf("%d번 motivation이 등록됨\n", LastId);
                LastId++;
            } else if (cmd.equals("list")) {
                System.out.println("=".repeat(15));
                System.out.printf(" 번호  /  source  /  motivation \n");
            }
        }
    }

}

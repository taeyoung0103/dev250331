package dev250331;
import java.util.Scanner;

public class App {

    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== motivation ���� ==");

        int LastId = 1;

        while (true) {
            System.out.print("��ɾ�)");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("exit")) {
                System.out.println("== motivation ���� ==");
                break;
            } else if (cmd.length() == 0) {
                System.out.println("��ɾ �Էµ��� �ʾҽ��ϴ�. �Է����ּ���");
            }

            if (cmd.equals("add")) {
                System.out.println("motivation : ");
                String motivation = sc.nextLine();
                System.out.println("source : ");
                String source = sc.nextLine();
                System.out.printf("%d�� motivation�� ��ϵ�\n", LastId);
                LastId++;
            } else if (cmd.equals("list")) {
                System.out.println("=".repeat(15));
                System.out.printf(" ��ȣ  /  source  /  motivation \n");
            }
        }
    }

}

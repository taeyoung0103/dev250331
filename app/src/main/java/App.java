package dev250331;
import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== motivation ���� ==");

        int lastid = 0;

        //Motivation motivation0 = null;
        //Motivation motivation1 = null;
        //Motivation motivation2 = null;

        List<Motivation> motivations = new ArrayList<Motivation>();


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
                int id = lastid + 1;
                System.out.println("body : ");
                String body = sc.nextLine();
                System.out.println("source : ");
                String source = sc.nextLine();

                Motivation motivation = new Motivation(id, body, source);
                //motivation.id = id;
                //motivation.body = body;
                //motivation.source = source;

                motivations.add(motivation);

                //if (motivation.id == 1) {
                //    motivation0 = motivation;
                //} else if  (motivation.id == 2) {
                //    motivation1 = motivation;
                //} else if (motivation.id == 3) {
                //    motivation2 = motivation;
                //}

                System.out.printf("%d�� motivation�� ��ϵ�\n", id);
                lastid++;
            } else if (cmd.equals("list")) {
                System.out.println("=".repeat(40));
                System.out.printf(" id  /  body  /  source \n");

                //��ȣ�� �������� �����Բ�
                for(int i = motivations.size() - 1; i>=0; i--) {
                    Motivation motivation = motivations.get(i);

                    if (motivation.getBody().length() > 7) {
                        System.out.printf(" %d  /   %s  /   %s  \n", motivation.getId(), motivation.getBody().substring(0, 5) + "...", motivation.getSource());
                        continue;
                    } 

                    System.out.printf(" %d  /   %s  /   %s  \n", motivation.getId(), motivation.getBody(), motivation.getSource());
                }

                //System.out.println(motivation0.toString());
                //System.out.println(motivation1.toString());
                //System.out.println(motivation2.toString());
                if(motivations.isEmpty()) {
                    System.out.println("��ϵ� ���� �����ϴ�.");
                } else {
                    System.out.println("���� �ֽ��ϴ�.");
                }
                
            } else {
                System.out.println("����Ҽ����� ��ɾ��Դϴ�.");
            }
        }
    }

}


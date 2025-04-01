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
        System.out.println("== motivation 실행 ==");

        int lastid = 0;

        //Motivation motivation0 = null;
        //Motivation motivation1 = null;
        //Motivation motivation2 = null;

        List<Motivation> motivations = new ArrayList<Motivation>();


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

                System.out.printf("%d번 motivation이 등록됨\n", id);
                lastid++;
            } else if (cmd.equals("list")) {
                System.out.println("=".repeat(40));
                System.out.printf(" id  /  body  /  source \n");

                //번호가 역순으로 나오게끔
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
                    System.out.println("등록된 값이 없습니다.");
                } else {
                    System.out.println("값이 있습니다.");
                }
                
            } else {
                System.out.println("사용할수없는 명령어입니다.");
            }
        }
    }

}


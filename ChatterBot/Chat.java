import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] repliesToIllegalRequest = {"what ", "say I should say "};
        ChatterBot[] bots = {
          new ChatterBot(repliesToIllegalRequest), 
          new ChatterBot(repliesToIllegalRequest)
        };
        String statement = "hello";
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; ; i = (i + 1) % bots.length) {
            statement = bots[i].replyTo(statement);
            System.out.println("bot " + i + " said: " +  statement);
            scanner.nextLine();
        }
    }
}

import java.util.Scanner;

class Chat {
    public static void main(String[] args) {
        String[][] repliesToIllegalRequest = {
            {"what ", "say I should say "},
            { "whaaat ", "say say " }
        };
        ChatterBot[] bots = {
          new ChatterBot(repliesToIllegalRequest[0]), 
          new ChatterBot(repliesToIllegalRequest[1])
        };
        String statement = "hello";
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; true; i = (i + 1) % bots.length) {
            statement = bots[i].replyTo(statement);
            System.out.println("bot " + (i + 1) + " said: " +  statement);
            scanner.nextLine();
            scanner.close();
        }
    }
}

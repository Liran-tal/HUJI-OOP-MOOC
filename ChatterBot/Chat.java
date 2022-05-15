import java.util.Scanner;

class Chat {
    public static void main(String[] args) {
        String[][] repliesToIllegalRequest = {
            {"what ", "say I should say "},
            { "whaaat ", "say say " }
        };
        ChatterBot[] bots = {
          new ChatterBot("Bot-1", repliesToIllegalRequest[0]), 
          new ChatterBot("Bot-2", repliesToIllegalRequest[1])
        };
        String statement = "hello";
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; true; i = (i + 1) % bots.length) {
            statement = bots[i].replyTo(statement);
            System.out.println(bots[i].getName() + " say: " +  statement);
            scanner.nextLine();
        }

        // scanner.close();
    }
}

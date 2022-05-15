import java.util.Random;

class ChatterBot {
    static final String REQUEST_PREFIX = "say ";
    
    String[] repliesToIllegalRequest;
    Random rand = new Random();
    String name;
    
    ChatterBot(String name, String[] repliesToIllegalRequest) {
        this.name = name;
        this.repliesToIllegalRequest = new String[repliesToIllegalRequest.length];
        
        for(int i = 0 ; i < repliesToIllegalRequest.length ; i = i+1) {
            this.repliesToIllegalRequest[i] = repliesToIllegalRequest[i];
        }
    }

    String replyTo(String statement) {
        if(statement.startsWith(REQUEST_PREFIX)) {
            return statement.replaceFirst(REQUEST_PREFIX, "");
        }
        return respondToIllegalRequest(statement);
    }

    String respondToIllegalRequest(String statement) {
        int randomIndex = rand.nextInt(repliesToIllegalRequest.length);
        String reply = repliesToIllegalRequest[randomIndex];
        
        if(rand.nextBoolean()) {
            reply = reply + statement;
        }
        return reply;
    }

    String getName () {
        return this.name;
    }
}

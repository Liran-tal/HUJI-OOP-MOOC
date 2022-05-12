import java.util.Random;

class ChatterBot {
    static final String REQUEST_PREFIX = "say ";

    Random rand = new Random();
    String[] repliesToIllegalRequest;

    ChatterBot(String[] repliesToIllegalRequest) {
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
}

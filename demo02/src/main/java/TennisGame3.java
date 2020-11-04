public class TennisGame3 {

    private int player2Score;
    private int player1Score;
    private String p1N;
    private String p2N;

    public TennisGame3(String p1N, String p2N) {
        this.p1N = p1N;
        this.p2N = p2N;
    }

    public String getScore() {
        String s;
        String[] p = new String[]
                {"Love", "Fifteen", "Thirty", "Forty"};

        if(เสมอกัน()) {
            return p[player1Score] + "-All";
        }

        // Normal
        if (player1Score < 4 && player2Score < 4
                && player1Score + player2Score != 6) {
            return p[player1Score] + "-" + p[player2Score];
        } else {
            if (player1Score == player2Score)
                return "Deuce";
            s = player1Score > player2Score ? p1N : p2N;
            if ((player1Score - player2Score)
                    * (player1Score - player2Score) == 1) return "Advantage " + s;
            return "Win for " + s;
        }
    }

    private boolean เสมอกัน() {
        return player1Score == player2Score && player1Score < 3;
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName)) {
            this.player1Score += 1;
        } else {
            this.player2Score += 1;
        }

    }

}

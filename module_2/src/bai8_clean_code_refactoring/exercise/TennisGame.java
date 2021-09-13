package bai8_clean_code_refactoring.exercise;

public class TennisGame {
    public static final int zero = '0';
    public static final int one = '1';
    public static final int two = '2';
    public static final int three = '3';

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        int tempScore = 0;
        if (player1Score == player2Score) {
            switch (player1Score) {
                case zero:
                    score = "Love-All";
                    break;
                case one:
                    score = "Fifteen-All";
                    break;
                case two:
                    score = "Thirty-All";
                    break;
                case three:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = player1Score;
                else {
                    score += "-";
                    tempScore = player2Score;
                }
                switch (tempScore) {
                    case zero:
                        score += "Love";
                        break;
                    case one:
                        score += "Fifteen";
                        break;
                    case two:
                        score += "Thirty";
                        break;
                    case three:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}
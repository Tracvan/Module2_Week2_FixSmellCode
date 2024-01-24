package src.com.codegym;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int score1, int score2) {
        String display = "";
        int score = 0;
        boolean isEqual = score1 == score2;
        if (isEqual) {
            switch (score1) {
                case 0:
                    display = "Love-All";
                    break;
                case 1:
                    display = "Fifteen-All";
                    break;
                case 2:
                    display = "Thirty-All";
                    break;
                case 3:
                    display = "Forty-All";
                    break;
                default:
                    display = "Deuce";
                    break;

            }
        } else {
            boolean isAdvantage = score1 >= 4 || score2 >= 4;
            if (isAdvantage) {
                int minusResult = score1 - score2;
                if (minusResult == 1) display = "Advantage player1";
                else if (minusResult == -1) display = "Advantage player2";
                else if (minusResult >= 2) display = "Win for player1";
                else display = "Win for player2";
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) score = score1;
                    else {
                        display += "-";
                        score = score2;
                    }
                    switch (score) {
                        case 0:
                            display += "Love";
                            break;
                        case 1:
                            display += "Fifteen";
                            break;
                        case 2:
                            display += "Thirty";
                            break;
                        case 3:
                            display += "Forty";
                            break;
                    }
                }
            }
        }
        return display;
    }
}
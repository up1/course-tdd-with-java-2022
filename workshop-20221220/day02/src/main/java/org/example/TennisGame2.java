package org.example;

import java.util.Objects;

public class TennisGame2 implements TennisGame {
    public int P1point = 0;
    public int P2point = 0;

    public String P1res = "";
    public String P2res = "";
    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String[] scoreNames
                = new String[] { "Love", "Fifteen", "Thirty", "Forty" };
        String score = "";
        if (P1point == P2point && P1point < 4) {
            score = scoreNames[P1point];
            score += "-All";
        }
        if (P1point == P2point && P1point >= 3)
            score = "Deuce";

        if (P1point > 0 && P2point == 0) {
            if(P1point <= 3 ){
                P1res = scoreNames[P1point];
            }
            P2res = scoreNames[P2point];
            score = P1res + "-" + P2res;
        }
        if (P2point > 0 && P1point == 0) {
            if(P2point <= 3 ){
                P2res = scoreNames[P2point];
            }
            P1res = scoreNames[P1point];
            score = P1res + "-" + P2res;
        }

        if (P1point > P2point && P1point < 4) {
            score = scoreNames[P1point] + "-" + scoreNames[P2point];
        }
        if (P2point > P1point && P2point < 4) {
            score = scoreNames[P1point] + "-" + scoreNames[P2point];
        }

        if (P1point > P2point && P2point >= 3) {
            score = "Advantage " + player1Name;
        }

        if (P2point > P1point && P1point >= 3) {
            score = "Advantage " + player2Name;
        }

        if (P1point >= 4 && P2point >= 0 && (P1point - P2point) >= 2) {
            score = "Win for " + player1Name;
        }
        if (P2point >= 4 && P1point >= 0 && (P2point - P1point) >= 2) {
            score = "Win for " + player2Name;
        }
        return score;
    }

    public void P1Score() {
        P1point++;
    }

    public void P2Score() {
        P2point++;
    }

    public void wonPoint(String player) {
        if (Objects.equals(player, player1Name))
            P1Score();
        else
            P2Score();
    }
}

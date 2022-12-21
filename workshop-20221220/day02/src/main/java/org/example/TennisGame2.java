package org.example;

import java.util.Objects;

public class TennisGame2 implements TennisGame {
    public int p1Point = 0;
    public int p2Point = 0;

    public String p1Res = "";
    public String p2Res = "";
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

        // Deuce
        if (p1Point == p2Point && p1Point >= 3) {
            score = "Deuce";
            return  score;
        }

        // All
        if (p1Point == p2Point && p1Point < 4) {
            score = scoreNames[p1Point];
            score += "-All";
            return  score;
        }


        if (p1Point > p2Point && p1Point < 4) {
            score = scoreNames[p1Point] + "-" + scoreNames[p2Point];
        }
        if (p2Point > p1Point && p2Point < 4) {
            score = scoreNames[p1Point] + "-" + scoreNames[p2Point];
        }

        if (p1Point > p2Point && p2Point >= 3) {
            score = "Advantage " + player1Name;
        }

        if (p2Point > p1Point && p1Point >= 3) {
            score = "Advantage " + player2Name;
        }

        if (p1Point >= 4 && p2Point >= 0 && (p1Point - p2Point) >= 2) {
            score = "Win for " + player1Name;
            return score;
        }
        if (p2Point >= 4 && p1Point >= 0 && (p2Point - p1Point) >= 2) {
            score = "Win for " + player2Name;
            return score;
        }


        // Try
        if (Math.max(p1Point, p2Point) < 4) {
            score = scoreNames[p1Point] + "-" + scoreNames[p2Point];
        }


        return score;
    }

    public void p1Score() {
        p1Point++;
    }

    public void p2Score() {
        p2Point++;
    }

    public void wonPoint(String player) {
        if (Objects.equals(player, player1Name))
            p1Score();
        else
            p2Score();
    }
}

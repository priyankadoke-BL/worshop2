package ticTTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeClass {
    private char board[] = new char[10];

    private char[] assign() {

        for (int i = 1; i <= board.length - 1; i++) {
            board[i] = ' ';
        }
        return board;
    }


}

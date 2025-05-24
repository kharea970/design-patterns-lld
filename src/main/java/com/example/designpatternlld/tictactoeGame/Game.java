package com.example.designpatternlld.tictactoeGame;

import com.example.designpatternlld.tictactoeGame.pieces.PieceCorrect;
import com.example.designpatternlld.tictactoeGame.pieces.PieceCross;
import com.example.designpatternlld.tictactoeGame.pieces.PieceType;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Deque<Player> players;
    private Board board;

    public Game() {
        initializeGame();
    }

    public void initializeGame() {
        players = new LinkedList<>();
        PieceCross pieceCross = new PieceCross(PieceType.CROSS);
        Player player1 = new Player("Ashish", pieceCross);
        PieceCorrect pieceCorrect = new PieceCorrect(PieceType.RIGHT);
        Player player2 = new Player("Bob", pieceCross);
        players.add(player1);
        players.add(player2);

        Board board1 = new Board(3);

    }


    public String startGame() {
        boolean noWinner = true;
        while(noWinner) {
            Player currentPlayer = players.poll();
            board.printBoard();
            List<Cell> freeCells = board.getFreeCells();
            if(freeCells.isEmpty()) {
                noWinner = false;
                continue;
            }


            //read the user input
            System.out.print("Player:" + currentPlayer.getName() + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean pieceAddedSuccessfully = board.addPiece(inputRow,inputColumn, currentPlayer.getPiece());
            if(!pieceAddedSuccessfully) {
                //player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorredt possition chosen, try again");
                players.addFirst(currentPlayer);
                continue;
            }
            players.addLast(currentPlayer);


            boolean winner = isThereWinner(inputRow, inputColumn, currentPlayer.getPiece().pieceType);
            if(winner) {
                return currentPlayer.getName();
            }
        }
        return "Tie";
    }


    public boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<board.size;i++) {

            if(board.board[row][i] == null || board.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<board.size;i++) {

            if(board.board[i][column] == null || board.board[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<board.size;i++,j++) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=board.size-1; i<board.size;i++,j--) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}

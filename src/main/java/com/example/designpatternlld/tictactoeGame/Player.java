package com.example.designpatternlld.tictactoeGame;

import com.example.designpatternlld.tictactoeGame.pieces.PlayingPiece;



public class Player {
    private String name;
    private PlayingPiece piece;

    public Player(String name, PlayingPiece piece) {
        this.name = name;
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayingPiece getPiece() {
        return piece;
    }

    public void setPiece(PlayingPiece piece) {
        this.piece = piece;
    }
}

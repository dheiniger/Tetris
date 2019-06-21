package com.gmail.daniel.r.heiniger.tetrominoes;

import com.gmail.daniel.r.heiniger.tetrominoes.composites.Composite;
import com.gmail.daniel.r.heiniger.tetrominoes.composites.DefaultPosition;

import java.awt.*;

public class TetrominoS extends Tetromino{
	private static final long serialVersionUID = 1L;
	private static final Color COLOR = Color.GREEN;
	
	public TetrominoS(){
		super();		
		this.pieceComposites[0] = new Composite(COLOR, DefaultPosition.POSITION_ONE);
		this.pieceComposites[1] = new Composite(COLOR, DefaultPosition.POSITION_TWO);
		this.pieceComposites[2] = new Composite(COLOR, DefaultPosition.POSITION_FOUR);
		this.pieceComposites[3] = new Composite(COLOR, DefaultPosition.POSITION_FIVE);
	}
}

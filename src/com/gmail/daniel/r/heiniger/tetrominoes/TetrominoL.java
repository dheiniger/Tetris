package com.gmail.daniel.r.heiniger.tetrominoes;

import com.gmail.daniel.r.heiniger.tetrominoes.composites.Composite;
import com.gmail.daniel.r.heiniger.tetrominoes.composites.DefaultPosition;

import java.awt.*;

public class TetrominoL extends Tetromino{
	private static final long serialVersionUID = 1L;
	private static final Color COLOR = Color.ORANGE;
	
	public TetrominoL(){
		super();		
		this.pieceComposites[0] = new Composite(COLOR, DefaultPosition.POSITION_ZERO);
		this.pieceComposites[1] = new Composite(COLOR, DefaultPosition.POSITION_ONE);
		this.pieceComposites[2] = new Composite(COLOR, DefaultPosition.POSITION_TWO);
		this.pieceComposites[3] = new Composite(COLOR, DefaultPosition.POSITION_FOUR);
	}
}

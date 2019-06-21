package com.gmail.daniel.r.heiniger.tetrominoes;

import com.gmail.daniel.r.heiniger.tetrominoes.composites.Composite;
import com.gmail.daniel.r.heiniger.tetrominoes.composites.DefaultPosition;

import java.awt.*;

public class TetrominoZ extends Tetromino{

	private static final long serialVersionUID = 1L;
	private static final Color COLOR = Color.RED;
	
	public TetrominoZ(){
		super();		
		this.pieceComposites[0] = new Composite(COLOR, DefaultPosition.POSITION_ZERO);
		this.pieceComposites[1] = new Composite(COLOR, DefaultPosition.POSITION_ONE);
		this.pieceComposites[2] = new Composite(COLOR, DefaultPosition.POSITION_FIVE);
		this.pieceComposites[3] = new Composite(COLOR, DefaultPosition.POSITION_SIX);
	}
	
}

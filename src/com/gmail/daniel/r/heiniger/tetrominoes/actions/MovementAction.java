package com.gmail.daniel.r.heiniger.tetrominoes.actions;

import com.gmail.daniel.r.heiniger.tetrominoes.Tetromino;

public abstract class MovementAction implements Moveable{
	protected Tetromino tetromino;
	
	public MovementAction(Tetromino tetromino){
		this.tetromino = tetromino;
	}
	
}

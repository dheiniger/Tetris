package com.gmail.daniel.r.heiniger.tetrominoes.actions;

import com.gmail.daniel.r.heiniger.tetrominoes.Tetromino;

public abstract class MovementAction{
	protected Tetromino tetromino;
	
	public MovementAction(Tetromino tetromino){
		this.tetromino = tetromino;
	}

	public abstract void move();

	@Override
	public boolean equals(Object other){
		return other.getClass() == this.getClass();
	}
}

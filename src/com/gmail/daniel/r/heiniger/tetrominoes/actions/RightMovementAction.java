package com.gmail.daniel.r.heiniger.tetrominoes.actions;

import com.gmail.daniel.r.heiniger.tetrominoes.Tetromino;

public class RightMovementAction extends MovementAction{

	public RightMovementAction(Tetromino tetromino) {
		super(tetromino);
	}

	@Override
	public void move() {
		tetromino.shiftRight();
	}

}

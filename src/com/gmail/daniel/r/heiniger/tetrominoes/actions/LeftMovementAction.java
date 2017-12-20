package com.gmail.daniel.r.heiniger.tetrominoes.actions;

import com.gmail.daniel.r.heiniger.tetrominoes.Tetromino;

public class LeftMovementAction extends MovementAction{

	public LeftMovementAction(Tetromino tetromino) {
		super(tetromino);
	}

	@Override
	public void move() {
		tetromino.shiftLeft();
	}
}

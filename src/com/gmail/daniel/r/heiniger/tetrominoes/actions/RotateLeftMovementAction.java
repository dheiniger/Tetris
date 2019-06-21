package com.gmail.daniel.r.heiniger.tetrominoes.actions;

import com.gmail.daniel.r.heiniger.tetrominoes.Tetromino;

public class RotateLeftMovementAction extends MovementAction{

	public RotateLeftMovementAction(Tetromino tetromino) {
		super(tetromino);
	}

	@Override
	public void move() {
		tetromino.rotateLeft();
	}

}

package com.gmail.daniel.r.heiniger.tetrominoes.actions;

import com.gmail.daniel.r.heiniger.tetrominoes.Tetromino;

public class RotateRightMovementAction extends MovementAction{

	public RotateRightMovementAction(Tetromino tetromino) {
		super(tetromino);
	}

	@Override
	public void move() {
		tetromino.rotateRight();
	}

}

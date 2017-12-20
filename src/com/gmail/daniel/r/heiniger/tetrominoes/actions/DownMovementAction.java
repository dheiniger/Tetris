package com.gmail.daniel.r.heiniger.tetrominoes.actions;

import com.gmail.daniel.r.heiniger.tetrominoes.Tetromino;

public class DownMovementAction extends MovementAction{

	public DownMovementAction(Tetromino tetromino) {
		super(tetromino);
	}

	@Override
	public void move() {
		tetromino.shiftDown();
	}

}

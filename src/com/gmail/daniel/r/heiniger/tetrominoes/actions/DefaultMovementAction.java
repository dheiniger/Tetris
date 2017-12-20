package com.gmail.daniel.r.heiniger.tetrominoes.actions;

import com.gmail.daniel.r.heiniger.tetrominoes.Tetromino;

public class DefaultMovementAction extends MovementAction{
	
	public DefaultMovementAction(Tetromino tetromino) {
		super(tetromino);
	}

	@Override
	public void move() {
		System.out.println("An invalid key was pressed!");
	}

}

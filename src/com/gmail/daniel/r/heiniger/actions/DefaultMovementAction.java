package com.gmail.daniel.r.heiniger.actions;

import com.gmail.daniel.r.heiniger.pieces.GamePiece;

public class DefaultMovementAction extends MovementAction{
	
	public DefaultMovementAction(GamePiece gamePiece) {
		super(gamePiece);
	}

	@Override
	public void move() {
		System.out.println("An invalid key was pressed!");
	}

}

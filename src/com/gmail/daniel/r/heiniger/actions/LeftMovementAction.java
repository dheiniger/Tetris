package com.gmail.daniel.r.heiniger.actions;

import com.gmail.daniel.r.heiniger.pieces.GamePiece;

public class LeftMovementAction extends MovementAction{

	public LeftMovementAction(GamePiece gamePiece) {
		super(gamePiece);
	}

	@Override
	public void move() {
		gamePiece.shiftLeft();
	}
}

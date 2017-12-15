package com.gmail.daniel.r.heiniger.actions;

import com.gmail.daniel.r.heiniger.pieces.GamePiece;

public class RightMovementAction extends MovementAction{

	public RightMovementAction(GamePiece gamePiece) {
		super(gamePiece);
	}

	@Override
	public void move() {
		gamePiece.shiftRight();
	}

}

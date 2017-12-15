package com.gmail.daniel.r.heiniger.actions;

import com.gmail.daniel.r.heiniger.pieces.GamePiece;

public class DownMovementAction extends MovementAction{

	public DownMovementAction(GamePiece gamePiece) {
		super(gamePiece);
	}

	@Override
	public void move() {
		gamePiece.shiftDown();
	}

}

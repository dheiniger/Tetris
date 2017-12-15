package com.gmail.daniel.r.heiniger.actions;

import com.gmail.daniel.r.heiniger.pieces.GamePiece;

public abstract class MovementAction implements Moveable{
	protected GamePiece gamePiece;
	
	public MovementAction(GamePiece gamePiece){
		this.gamePiece = gamePiece;
	}
	
}

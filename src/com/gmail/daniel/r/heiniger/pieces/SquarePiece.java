package com.gmail.daniel.r.heiniger.pieces;

import java.awt.Color;

import com.gmail.daniel.r.heiniger.pieces.composites.Composite;
import com.gmail.daniel.r.heiniger.pieces.composites.Position;

public class SquarePiece extends GamePiece{
	private static final long serialVersionUID = 1L;
	private static final Color COLOR = Color.CYAN;
	
	public SquarePiece(){
		super();
		Position startingPosition = new Position(Position.getDrawingCenterXCoordinate(), 0);
		this.pieceComposites[0] = new Composite(COLOR, startingPosition);
		this.pieceComposites[1] = new Composite(COLOR, Position.getPositionRightOf(startingPosition));
		this.pieceComposites[2] = new Composite(COLOR, startingPosition = Position.getPositionBelow(startingPosition));
		this.pieceComposites[3] = new Composite(COLOR, Position.getPositionRightOf(startingPosition));
	}
}

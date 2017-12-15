package com.gmail.daniel.r.heiniger.pieces;

import static org.junit.Assert.*;

import org.junit.Test;
import com.gmail.daniel.r.heiniger.pieces.composites.Position;

public class LinePieceTest {
	
	@Test
	public void testDefaultCompositePositions(){
		GamePiece linePiece = new LinePiece();
		int xCoordinate = Position.getDrawingCenterXCoordinate();
		
		assertEquals(new Position(xCoordinate, 0), linePiece.getComposites()[0].getPosition());
		assertEquals(new Position(xCoordinate + Position.getShiftXAmount(), 0), linePiece.getComposites()[1].getPosition());
		assertEquals(new Position(xCoordinate + Position.getShiftXAmount() * 2, 0), linePiece.getComposites()[2].getPosition());
		assertEquals(new Position(xCoordinate + Position.getShiftXAmount() * 3, 0), linePiece.getComposites()[3].getPosition());
	}
}

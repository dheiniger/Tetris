package com.gmail.daniel.r.heiniger.pieces;

import static org.junit.Assert.*;

import org.junit.Test;
import com.gmail.daniel.r.heiniger.pieces.composites.Position;

public class LinePieceTest {
	
	@Test
	public void testDefaultCompositePositions(){
		GamePiece linePiece = new LinePiece();
		int xCoordinate = Position.getCenterXCoordinate()-Position.getShiftXAmount();
		
		assertEquals(new Position(xCoordinate, 0), linePiece.getComposites()[0].getPosition());
		assertEquals(new Position(xCoordinate, Position.getShiftYAmount()), 
				linePiece.getComposites()[1].getPosition());
		assertEquals(new Position(xCoordinate, Position.getShiftYAmount() * 2), 
				linePiece.getComposites()[2].getPosition());
		assertEquals(new Position(xCoordinate, Position.getShiftYAmount() * 3), 
				linePiece.getComposites()[3].getPosition());
	}
}

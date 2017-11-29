package com.gmail.daniel.r.heiniger.pieces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gmail.daniel.r.heiniger.pieces.composites.Position;

public class SquarePieceTest {
	
	@Test
	public void testDefaultCompositePositions(){
		GamePiece linePiece = new SquarePiece();
		
		assertEquals(new Position(Position.getDrawingCenterXCoordinate(), 0), linePiece.getComposites()[0].getPosition());
		assertEquals(new Position(Position.getDrawingCenterXCoordinate() + Position.getShiftXAmount(), 0), 
				linePiece.getComposites()[1].getPosition());
		assertEquals(new Position(Position.getDrawingCenterXCoordinate() , Position.getShiftYAmount()), 
				linePiece.getComposites()[2].getPosition());
		assertEquals(new Position(Position.getDrawingCenterXCoordinate() + Position.getShiftXAmount(), Position.getShiftYAmount()), 
				linePiece.getComposites()[3].getPosition());
	}

}

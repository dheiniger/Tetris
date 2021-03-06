package com.gmail.daniel.r.heiniger.tetrominoes.composites;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.gmail.daniel.r.heiniger.engine.EngineProperties;

public class PositionTest {
	private static final int BUFFER_SPACE = 1;
	
	@Test
	public void testCopy(){
		Position original = new Position();
		Position copy = Position.getPositionRightOf(original);
		assertNotEquals(original, copy);
	}
	
	@Test
	public void testCenterX(){
		assertEquals(EngineProperties.BOARD_WIDTH/2 - BUFFER_SPACE, Position.getCenterXCoordinate());
	}
	
	@Test
	public void testShiftRight(){
		Position original = new Position();
		assertEquals(0, original.getX());
		assertEquals(0, original.getY());
		assertEquals(Position.getShiftXAmount(), original.shiftRight().getX());
	}
	
	@Test
	public void testShiftLeft(){
		Position original = new Position();
		assertEquals(0, original.getX());
		assertEquals(0, original.getY());
		assertEquals(0 - Position.getShiftXAmount(), new Position().shiftLeft().getX());
	}
	
	@Test
	public void testShiftUp(){
		Position original = new Position(0, 100);
		assertEquals(0, original.getX());
		assertEquals(100, original.getY());
		assertEquals(100 - Position.getShiftYAmount(), original.shiftUp().getY());
	}
	
	@Test
	public void testShiftDown(){
		Position original = new Position(0, 100);
		assertEquals(0, original.getX());
		assertEquals(100, original.getY());
		assertEquals(100 + Position.getShiftYAmount(), original.shiftDown().getY());
	}
	
	@Test
	public void testPositionUpOnce(){
		Position original = new Position(0, 100);
		Position shiftedPosition = Position.getPositionAbove(original);
		
		assertEquals(original.getX(), shiftedPosition.getX());
		assertEquals(original.getY() - Position.getShiftYAmount(), shiftedPosition.getY());
	}
	
	@Test
	public void testPositionDownOnce(){
		Position original = new Position(0, 100);
		Position shiftedPosition = Position.getPositionBelow(original);
		
		assertEquals(original.getX(), shiftedPosition.getX());
		assertEquals(original.getY() + Position.getShiftYAmount(), shiftedPosition.getY());
	}
	
	@Test
	public void testPositionRightOnce(){
		Position original = new Position();
		Position shiftedPosition = Position.getPositionRightOf(original);
		
		assertEquals(original.getY(), shiftedPosition.getY());
		assertEquals(Position.getShiftXAmount(), shiftedPosition.getX());
	}
	
	@Test
	public void testPositionRightTwice(){
		Position original = new Position();
		Position shiftedPosition = Position.getPositionRightOf(original);
		
		assertEquals(original.getY(), shiftedPosition.getY());
		assertEquals(Position.getShiftXAmount(), shiftedPosition.getX());
		assertEquals(Position.getShiftXAmount()*2, Position.getPositionRightOf(shiftedPosition).getX());
	}
	
	@Test
	public void testPositionLeftOnce(){
		Position original = new Position();
		Position shiftedPosition = Position.getPositionLeftOf(original);
		
		assertEquals(0, original.getX());
		assertEquals(original.getY(), shiftedPosition.getY());
		assertEquals(original.getX() - Position.getShiftXAmount(), shiftedPosition.getX());
	}
	
	@Test
	public void testPositionRightThenLeft(){
		Position original = new Position();
		Position shiftedPosition = Position.getPositionRightOf(original);
		
		assertEquals(0, original.getX());
		assertEquals(original.getY(), shiftedPosition.getY());
		assertEquals(original.getX() + Position.getShiftXAmount(), shiftedPosition.getX());
		assertEquals(original.getX(), Position.getPositionLeftOf(shiftedPosition).getX());
	}

	@Test
	public void whenXCoordinatesAreDifferent_PositionsAreNotEqual(){
		assertNotEquals(new Position(1, 1),
						new Position(2, 1));
	}

	@Test
	public void whenYCoordinatesAreDifferent_PositionsAreNotEqual(){
		assertNotEquals(new Position(1, 1),
				new Position(1, 2));
	}

}

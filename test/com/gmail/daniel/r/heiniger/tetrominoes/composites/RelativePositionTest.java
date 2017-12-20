package com.gmail.daniel.r.heiniger.tetrominoes.composites;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gmail.daniel.r.heiniger.tetrominoes.Tetromino;
import com.gmail.daniel.r.heiniger.tetrominoes.TetrominoI;
public class RelativePositionTest {
	private static final Position POSITION_ZERO = new Position(0,0);
	private static final RelativePosition RELATIVE_POSITION_ZERO = new RelativePosition(0, POSITION_ZERO);
	
//	@Test
//	public void testPositionZeroFromRelativePositionOne(){
//		RelativePosition positionOne = new RelativePosition(0, new Position(0, 0));
//		assertEquals(RELATIVE_POSITION_ZERO, RelativePosition.getRelativePositionZero(positionOne));
//	}
//	
//	@Test
//	public void testPositionZeroFromRelativePositionGreaterThanFour(){
//		RelativePosition positionSeven = new RelativePosition(6, new Position(2*Position.getShiftXAmount(), 
//																				Position.getShiftYAmount()));
//		assertEquals(RELATIVE_POSITION_ZERO, RelativePosition.getRelativePositionZero(positionSeven));
//	}
//	
//	@Test
//	public void testPositionZeroFromRelativePositionGreaterThanSixteen(){
//		RelativePosition positionSeventeen = new RelativePosition(17, new Position(Position.getShiftXAmount(), 
//																			   4*Position.getShiftYAmount()));
//		
//		try{
//			RelativePosition.getRelativePositionZero(positionSeventeen);
//			fail("An indexOutOfBoundsException should have been thrown!");
//		}catch (IndexOutOfBoundsException exception){
//			assertTrue("Success, An exception was caught", true);
//		}
//	}
//	
//	@Test
//	public void testPositionZeroFromRelativePositionZero(){
//		RelativePosition zeroPosition = new RelativePosition(0, new Position(0,0));
//		assertEquals(RELATIVE_POSITION_ZERO, RelativePosition.getRelativePositionZero(zeroPosition));
//	}
//	
	
	@Test
	public void testRotateTetrominoIRight(){
		Tetromino tetrominoI = new TetrominoI();
		tetrominoI.rotateRight();
		assertEquals(3, getIndexFromComposite(tetrominoI.getComposites()[0]));
		assertEquals(7, getIndexFromComposite(tetrominoI.getComposites()[1]));
		assertEquals(11, getIndexFromComposite(tetrominoI.getComposites()[2]));
		assertEquals(15, getIndexFromComposite(tetrominoI.getComposites()[3]));
		assertEquals(Position.getCenterXCoordinate() + (3 * Position.getShiftXAmount()), getXPositionFromComposite(tetrominoI.getComposites()[0]));
	}
	
	@Test
	public void testRotateTetrominoIRightTwice(){
		Tetromino tetrominoI = new TetrominoI();
		tetrominoI.rotateRight();
		tetrominoI.rotateRight();
		assertEquals(15, getIndexFromComposite(tetrominoI.getComposites()[0]));
		assertEquals(14, getIndexFromComposite(tetrominoI.getComposites()[1]));
		assertEquals(13, getIndexFromComposite(tetrominoI.getComposites()[2]));
		assertEquals(12, getIndexFromComposite(tetrominoI.getComposites()[3]));
	}
	
	@Test
	public void testRotateTetrominoIRightOnceThenShiftDownThenRotateRightAgain(){
		Tetromino tetrominoI = new TetrominoI();
		tetrominoI.rotateRight();
		tetrominoI.shiftDown();
		tetrominoI.rotateRight();
		assertEquals(15, getIndexFromComposite(tetrominoI.getComposites()[0]));
		assertEquals(14, getIndexFromComposite(tetrominoI.getComposites()[1]));
		assertEquals(13, getIndexFromComposite(tetrominoI.getComposites()[2]));
		assertEquals(12, getIndexFromComposite(tetrominoI.getComposites()[3]));
	}
	
	@Test
	public void testGetAllRelativePositionsFromRelativePositionOne(){
		assertEquals(RelativePosition.MAX_RELATIVE_POSITIONS,
					 RelativePosition.getAllRelativePositions(RELATIVE_POSITION_ZERO).length);
		assertEquals(RelativePosition.getRelativePositionBelow(RELATIVE_POSITION_ZERO),
				 RelativePosition.getAllRelativePositions(RELATIVE_POSITION_ZERO)[4]);
	}
	
	@Test
	public void testGetAllRelativePositionsFromRelativeGreaterThanFour(){
		assertEquals(RelativePosition.MAX_RELATIVE_POSITIONS,
					 RelativePosition.getAllRelativePositions(new RelativePosition(7, new Position(
							 																2*Position.getShiftXAmount(),
							 																Position.getShiftYAmount()))).length);
		assertEquals(RelativePosition.getRelativePositionRightOf(RELATIVE_POSITION_ZERO),
				 RelativePosition.getAllRelativePositions(RELATIVE_POSITION_ZERO)[1]);
	}
	
	//TODO figure out numCols to move
//	private Position getPositionFromIndex(int index){
//		return new Position
//	}
//	
//	private int numberOfColumnsToMove(int index){
//		return 
//	}
	
	private int numberOfRowsToMove(int index){
		return index-1/RelativePosition.ROW_WIDTH;
	}
	
	private int getIndexFromComposite(Composite composite){
		return composite.getRelativePosition().getIndex();
	}
	
	private int getXPositionFromComposite(Composite composite){
		return composite.getRelativePosition().getX();
	}
	
	private int getYPositionFromComposite(Composite composite){
		return composite.getRelativePosition().getY();
	}
}

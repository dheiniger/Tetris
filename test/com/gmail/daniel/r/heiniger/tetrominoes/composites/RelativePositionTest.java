package com.gmail.daniel.r.heiniger.tetrominoes.composites;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.gmail.daniel.r.heiniger.tetrominoes.Tetromino;
import com.gmail.daniel.r.heiniger.tetrominoes.TetrominoI;
public class RelativePositionTest {
	private static final Position POSITION_ZERO = DefaultPosition.POSITION_ZERO.getPosition();
	private static final RelativePosition RELATIVE_POSITION_ZERO = new RelativePosition(0, POSITION_ZERO);
	
	@Test
	public void testRotateTetrominoIRight(){
		Tetromino tetrominoI = new TetrominoI();
		tetrominoI.rotateRight();
		assertEquals(3, getIndexFromComposite(tetrominoI.getComposites()[0]));
		assertEquals(7, getIndexFromComposite(tetrominoI.getComposites()[1]));
		assertEquals(11, getIndexFromComposite(tetrominoI.getComposites()[2]));
		assertEquals(15, getIndexFromComposite(tetrominoI.getComposites()[3]));
		assertEquals(DefaultPosition.POSITION_THREE.getPosition().x, getXPositionFromComposite(tetrominoI.getComposites()[0]));
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
		RelativePosition relativePositionOne = new RelativePosition(1, DefaultPosition.POSITION_ONE.getPosition());
		assertEquals(RelativePosition.MAX_RELATIVE_POSITIONS, RelativePosition.getAllRelativePositions(relativePositionOne).length);
		assertEquals(RelativePosition.getRelativePositionBelow(RELATIVE_POSITION_ZERO), RelativePosition.getAllRelativePositions(relativePositionOne)[4]);
	}
	
	@Test
	public void testGetAllRelativePositionsFromRelativePositionGreaterThanFour(){
		RelativePosition relativePositionSeven = new RelativePosition(7, new Position(DefaultPosition.POSITION_SEVEN.getPosition()));
		assertEquals(RelativePosition.MAX_RELATIVE_POSITIONS, RelativePosition.getAllRelativePositions(relativePositionSeven).length);
		assertEquals(RelativePosition.getRelativePositionRightOf(RELATIVE_POSITION_ZERO),
				 RelativePosition.getAllRelativePositions(relativePositionSeven)[1]);
	}
	
	@Test
	public void testGetAllRelativePositionsFromRelativePositionFour(){
		RelativePosition relativePositionFour = new RelativePosition(4, new Position(DefaultPosition.POSITION_FOUR.getPosition()));
		assertEquals(RelativePosition.MAX_RELATIVE_POSITIONS,
					 RelativePosition.getAllRelativePositions(new RelativePosition(4, new Position(relativePositionFour))).length);
		assertEquals(RELATIVE_POSITION_ZERO, RelativePosition.getAllRelativePositions(relativePositionFour)[0]);
	}

	@Test(expected = RelativePosition.PositionOutOfBoundsException.class)
	public void whenIndexIsLessThan0_IndexOutOfBoundsThrown(){
		RelativePosition.getAllRelativePositions(new RelativePosition(-1, new Position()));
	}

	@Test(expected = RelativePosition.PositionOutOfBoundsException.class)
	public void whenIndexIsMoreThanMax_IndexOutOfBoundsThrown(){
		RelativePosition.getAllRelativePositions(new RelativePosition(RelativePosition.MAX_RELATIVE_POSITIONS + 1, new Position()));
	}

	@Test
	public void whenIndicesDoNotMatch_RelativePositionsAreNotEqual(){
		assertNotEquals(new RelativePosition(1, new Position()),
						new RelativePosition(2, new Position()));
	}

	@Test
	public void whenXPositionsDoNotMatch_RelativePositionsAreNotEqual(){
		assertNotEquals(new RelativePosition(1, new Position(1, 1)),
				new RelativePosition(1, new Position(2, 1)));
	}

	@Test
	public void whenYPositionsDoNotMatch_RelativePositionsAreNotEqual(){
		assertNotEquals(new RelativePosition(1, new Position(1, 1)),
				new RelativePosition(1, new Position(1, 2)));
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

package com.gmail.daniel.r.heiniger.tetrominoes;

import com.gmail.daniel.r.heiniger.tetrominoes.composites.DefaultPosition;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TetrominoITest {
	
	@Test
	public void testDefaultCompositePositions(){
		Tetromino tetrominoI = new TetrominoI();
		
		assertEquals(DefaultPosition.POSITION_ZERO.getPosition(), tetrominoI.getComposites()[0].getRelativePosition());
		assertEquals(DefaultPosition.POSITION_ONE.getPosition(), tetrominoI.getComposites()[1].getRelativePosition());
		assertEquals(DefaultPosition.POSITION_TWO.getPosition(), tetrominoI.getComposites()[2].getRelativePosition());
		assertEquals(DefaultPosition.POSITION_THREE.getPosition(), tetrominoI.getComposites()[3].getRelativePosition());
	}
}

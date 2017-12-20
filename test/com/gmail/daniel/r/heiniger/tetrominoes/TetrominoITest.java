package com.gmail.daniel.r.heiniger.tetrominoes;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gmail.daniel.r.heiniger.tetrominoes.Tetromino;
import com.gmail.daniel.r.heiniger.tetrominoes.TetrominoI;
import com.gmail.daniel.r.heiniger.tetrominoes.composites.Position;
import com.gmail.daniel.r.heiniger.tetrominoes.composites.DefaultPosition;

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

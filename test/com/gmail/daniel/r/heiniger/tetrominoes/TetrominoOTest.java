package com.gmail.daniel.r.heiniger.tetrominoes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gmail.daniel.r.heiniger.tetrominoes.Tetromino;
import com.gmail.daniel.r.heiniger.tetrominoes.TetrominoO;
import com.gmail.daniel.r.heiniger.tetrominoes.composites.Position;
import com.gmail.daniel.r.heiniger.tetrominoes.composites.DefaultPosition;

public class TetrominoOTest {
	
	@Test
	public void testDefaultCompositePositions(){
		Tetromino tetrominoO = new TetrominoO();
		
		assertEquals(DefaultPosition.POSITION_ZERO.getPosition(), tetrominoO.getComposites()[0].getRelativePosition());
		assertEquals(DefaultPosition.POSITION_ONE.getPosition(), tetrominoO.getComposites()[1].getRelativePosition());
		assertEquals(DefaultPosition.POSITION_FOUR.getPosition(), tetrominoO.getComposites()[2].getRelativePosition());
		assertEquals(DefaultPosition.POSITION_FIVE.getPosition(), tetrominoO.getComposites()[3].getRelativePosition());
	}

}

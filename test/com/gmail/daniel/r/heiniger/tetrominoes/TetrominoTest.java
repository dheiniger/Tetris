package com.gmail.daniel.r.heiniger.tetrominoes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TetrominoTest {

	private Tetromino tetromino;

	@Before
	public void setup(){
		tetromino = new TetrominoZ();
	}

	@Test
	public void whenTetrominoTypesMatch_TetrominosAreEqual(){
		assertEquals(new TetrominoI(), new TetrominoI());
	}

	@Test
	public void whenTetrominoTypesDoNotMatch_TetrominosAreNotEqual(){
		assertNotEquals(new TetrominoI(), new TetrominoZ());
	}
}

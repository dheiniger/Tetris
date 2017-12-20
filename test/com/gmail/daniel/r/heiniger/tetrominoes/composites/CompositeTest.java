package com.gmail.daniel.r.heiniger.tetrominoes.composites;

import java.awt.Color;

import org.junit.Test;
import static org.junit.Assert.*;

public class CompositeTest {

	@Test
	public void testCopy(){
		Composite original = new Composite(Color.RED, DefaultPosition.POSITION_ZERO);
		Composite copy = new Composite(original);		
		assertEquals(original, copy);
		
		original.getRelativePosition().shiftDown();
		assertNotEquals(original, copy);
	}
	
	@Test
	public void defaultCompositeTest(){
		Composite composite = new Composite(Color.RED);
		assertEquals(0, composite.getRelativePosition().getIndex());
		assertEquals(DefaultPosition.POSITION_ZERO.getPosition(), composite.getRelativePosition());
	}
	
	@Test
	public void compsiteWithSpecifiedPositionTest(){
		Composite composite = new Composite(Color.RED, DefaultPosition.POSITION_EIGHT);
		assertEquals(8, composite.getRelativePosition().getIndex());
		assertEquals(DefaultPosition.POSITION_EIGHT.getPosition(), composite.getRelativePosition());
	}
	
	@Test
	public void compositeWithSpecifiedBorderTest(){
		Composite composite = new Composite(Color.RED, Color.BLACK, DefaultPosition.POSITION_FOURTEEN);
		assertEquals(14, composite.getRelativePosition().getIndex());
		assertEquals(DefaultPosition.POSITION_FOURTEEN.getPosition(), composite.getRelativePosition());
	}
}

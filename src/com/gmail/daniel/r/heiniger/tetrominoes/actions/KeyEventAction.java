package com.gmail.daniel.r.heiniger.tetrominoes.actions;

import com.gmail.daniel.r.heiniger.tetrominoes.Tetromino;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

public class KeyEventAction {
	
	public static MovementAction getMovementActionFromKeyCode(KeyEvent e, Tetromino tetromino){
		if(e == null){
			throw new InvalidKeyPressed();
		}
		if(getKeyCodeToActionMap(tetromino).get(e.getKeyCode()) == null){
			return new DefaultMovementAction(tetromino);
		}
		return getKeyCodeToActionMap(tetromino).get(e.getKeyCode());
	}
	
	private static Map<Integer, MovementAction> getKeyCodeToActionMap(Tetromino tetromino){
		Map<Integer, MovementAction> keyEventMap = new HashMap<>();
		keyEventMap.put(KeyEvent.VK_Z, new LeftMovementAction(tetromino));
		keyEventMap.put(KeyEvent.VK_LEFT, new LeftMovementAction(tetromino));
		
		keyEventMap.put(KeyEvent.VK_X, new RightMovementAction(tetromino));
		keyEventMap.put(KeyEvent.VK_RIGHT, new RightMovementAction(tetromino));

		keyEventMap.put(KeyEvent.VK_DOWN, new DownMovementAction(tetromino));
		
		keyEventMap.put(KeyEvent.VK_A, new RotateLeftMovementAction(tetromino));
		keyEventMap.put(KeyEvent.VK_S, new RotateRightMovementAction(tetromino));
		return keyEventMap;
	}

	protected static class InvalidKeyPressed extends RuntimeException{

	}
}

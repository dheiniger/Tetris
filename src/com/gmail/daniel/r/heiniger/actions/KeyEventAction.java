package com.gmail.daniel.r.heiniger.actions;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

import com.gmail.daniel.r.heiniger.pieces.GamePiece;

public class KeyEventAction {
	
	public static MovementAction getMovementActionFromKeyCode(KeyEvent e, GamePiece gamePiece){
		if(getKeyCodeToActionMap(gamePiece).get(e.getKeyCode()) == null){
			return new DefaultMovementAction(gamePiece);
		}
		return getKeyCodeToActionMap(gamePiece).get(e.getKeyCode());
	}
	
	private static Map<Integer, MovementAction> getKeyCodeToActionMap(GamePiece gamePiece){
		Map<Integer, MovementAction> keyEventMap = new HashMap<Integer, MovementAction>();
		keyEventMap.put(KeyEvent.VK_Z, new LeftMovementAction(gamePiece));
		keyEventMap.put(KeyEvent.VK_LEFT, new LeftMovementAction(gamePiece));
		
		keyEventMap.put(KeyEvent.VK_X, new RightMovementAction(gamePiece));
		keyEventMap.put(KeyEvent.VK_RIGHT, new RightMovementAction(gamePiece));
		keyEventMap.put(KeyEvent.VK_DOWN, new DownMovementAction(gamePiece));
		
		keyEventMap.put(KeyEvent.VK_A, new RotateLeftMovementAction(gamePiece));
		keyEventMap.put(KeyEvent.VK_S, new RotateRightMovementAction(gamePiece));
		return keyEventMap;
	}
}

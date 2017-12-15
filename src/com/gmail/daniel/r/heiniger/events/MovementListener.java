package com.gmail.daniel.r.heiniger.events;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.gmail.daniel.r.heiniger.actions.KeyEventAction;
import com.gmail.daniel.r.heiniger.pieces.GamePiece;

public class MovementListener implements KeyListener{
	
	private GamePiece activePiece;	

	public MovementListener(GamePiece activePiece){
		this.activePiece = activePiece;
	}
		
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyChar() + " key pressed!");
		KeyEventAction.getMovementActionFromKeyCode(e, activePiece).move();
		activePiece.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println(e.getKeyChar() + " key released!");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println(e.getKeyChar() + " key Typed!");
	}
}

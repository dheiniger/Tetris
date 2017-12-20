package com.gmail.daniel.r.heiniger.events;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.gmail.daniel.r.heiniger.tetrominoes.Tetromino;
import com.gmail.daniel.r.heiniger.tetrominoes.actions.KeyEventAction;

public class MovementListener implements KeyListener{
	
	private Tetromino activePiece;	

	public MovementListener(Tetromino activePiece){
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

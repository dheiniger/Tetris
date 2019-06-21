package com.gmail.daniel.r.heiniger.tetrominoes;

import com.gmail.daniel.r.heiniger.tetrominoes.composites.Composite;

import javax.swing.*;
import java.awt.*;

import static java.util.Arrays.stream;

public abstract class Tetromino extends JPanel{
	private static final long serialVersionUID = 1L;
	private static int NUMBER_OF_COMPOSITES = 4;

	protected Composite[] pieceComposites;
	
	public Tetromino(){
		pieceComposites = new Composite[NUMBER_OF_COMPOSITES];
	}
	
	public Composite[] getComposites(){
		return this.pieceComposites;
	}
	
	protected int getNumberOfComposites(){
		return NUMBER_OF_COMPOSITES;
	}

	public void shiftLeft(){
		stream(pieceComposites).forEach(composite -> composite.getRelativePosition().shiftLeft());
	}
	
	public void shiftRight(){
		stream(pieceComposites).forEach(composite -> composite.getRelativePosition().shiftRight());
	}
	
	public void shiftUp(){
		stream(pieceComposites).forEach(composite -> composite.getRelativePosition().shiftUp());
	}
	
	public void shiftDown(){
		stream(pieceComposites).forEach(composite -> composite.getRelativePosition().shiftDown());
	}
	
	public void rotateRight(){
		//TODO violation of de-meter
		stream(pieceComposites).forEach(composite -> composite.getRelativePosition().rotateRight());
//		for (Composite composite : pieceComposites) {
//			composite.getRelativePosition().rotateRight();
//		}
//		for (Composite composite : pieceComposites) {
//			if(composite)
//		}
	}
	
	private void reorient(){
////		while(isNotTopOriented()){
//			
//		}
	}
	
//	private void orientTop(){
//		while(isNotTopOriented()){
//			for (Composite composite : pieceComposites) {
////				RelativePosition.getRelativePositionAbove(relativePosition);
//			}
//		}
//	}
//
//	private boolean isNotTopOriented(){
//		return !isTopOriented();
//	}
//
//	private boolean isNotLeftOriented(){
//		return !isLeftOriented();
//	}
//
//	private boolean isTopOriented(){
//		for (Composite composite : pieceComposites) {
//			if(composite.getRelativePosition().getIndex() < RelativePosition.ROW_WIDTH){
//				return true;
//			}
//		}
//		return false;
//	}
//
//	private boolean isLeftOriented(){
//		for (Composite composite : pieceComposites) {
//			if(composite.getRelativePosition().getIndex() % RelativePosition.ROW_HEIGHT == 0){
//				return true;
//			}
//		}
//		return false;
//	}
//
	public void rotateLeft(){
	
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);

		stream(pieceComposites).forEach(composite -> composite.paintComponent(g));
	}

	@Override
	public boolean equals(Object rhs){
		return rhs.getClass() == this.getClass();
	}
}

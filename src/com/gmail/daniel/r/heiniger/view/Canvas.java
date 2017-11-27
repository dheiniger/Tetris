package com.gmail.daniel.r.heiniger.view;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.gmail.daniel.r.heiniger.engine.Engine;
import com.gmail.daniel.r.heiniger.pieces.GamePiece;
import com.gmail.daniel.r.heiniger.pieces.LinePiece;

public class Canvas extends JFrame{
	
	public Canvas(){
		initializeDefaultFrame();
		buildInterface();
	}

	private void initializeDefaultFrame() {
		setVisible(true);
		setSize(determineWidth(), determineHeight());
		setTitle("Tetris");
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void buildInterface(){
		JPanel squarePane = new JPanel();
		addPiece(new LinePiece());
	}
	
	private JComponent buildScoreComponent(){
		return new JTextArea();
	}
	
	public void addPiece(GamePiece gamePiece){
		getContentPane().add(gamePiece);
	}
	
	private int determineWidth(){
		return Engine.BOARD_WIDTH * Engine.SCALE;
	}
	
	private int determineHeight(){
		return Engine.BOARD_HEIGHT * Engine.SCALE;
	}
}

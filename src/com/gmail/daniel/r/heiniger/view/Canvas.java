package com.gmail.daniel.r.heiniger.view;

import com.gmail.daniel.r.heiniger.engine.EngineProperties;
import com.gmail.daniel.r.heiniger.events.MovementListener;
import com.gmail.daniel.r.heiniger.tetrominoes.*;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public Canvas(){
		initializeDefaultFrame();
		buildInterface();
	}

	private void initializeDefaultFrame() {
		setVisible(true);
		setSize(EngineProperties.BOARD_WIDTH, EngineProperties.BOARD_HEIGHT);
		setResizable(false);
		setTitle("Tetris");
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void buildInterface(){
		Tetromino activePiece = new TetrominoO();
		
		activePiece = new TetrominoI();
//		activePiece = new TetrominoJ();
//		activePiece = new TetrominoL();
//		activePiece = new TetrominoO();
//		activePiece = new TetrominoS();
		activePiece = new TetrominoT();
		activePiece = new TetrominoZ();
		setEventListeners(activePiece);
		addPiece(activePiece);
	}
	
	private void setEventListeners(Tetromino activePiece){
		this.addKeyListener(new MovementListener(activePiece));
	}
	
	private JComponent buildScoreComponent(){
		return new JTextArea();
	}
	
	public void addPiece(Tetromino tetromino){
		getContentPane().add(tetromino);
	}
}

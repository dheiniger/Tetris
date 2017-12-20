package com.gmail.daniel.r.heiniger.view;

import java.awt.Color;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import com.gmail.daniel.r.heiniger.engine.Engine;
import com.gmail.daniel.r.heiniger.events.MovementListener;
import com.gmail.daniel.r.heiniger.tetrominoes.Tetromino;
import com.gmail.daniel.r.heiniger.tetrominoes.TetrominoI;
import com.gmail.daniel.r.heiniger.tetrominoes.TetrominoJ;
import com.gmail.daniel.r.heiniger.tetrominoes.TetrominoL;
import com.gmail.daniel.r.heiniger.tetrominoes.TetrominoO;
import com.gmail.daniel.r.heiniger.tetrominoes.TetrominoS;
import com.gmail.daniel.r.heiniger.tetrominoes.TetrominoT;
import com.gmail.daniel.r.heiniger.tetrominoes.TetrominoZ;

public class Canvas extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public Canvas(){
		initializeDefaultFrame();
		buildInterface();
	}

	private void initializeDefaultFrame() {
		setVisible(true);
		setSize(Engine.BOARD_WIDTH, Engine.BOARD_HEIGHT);
		setResizable(false);
		setTitle("Tetris");
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void buildInterface(){
		Tetromino activePiece = new TetrominoO();
		
		
//		activePiece = new TetrominoI();
//		activePiece = new TetrominoJ();
//		activePiece = new TetrominoL();
//		activePiece = new TetrominoO();
//		activePiece = new TetrominoS();
//		activePiece = new TetrominoT();
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

package com.gmail.daniel.r.heiniger.view;

import java.awt.Color;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.gmail.daniel.r.heiniger.engine.Engine;
import com.gmail.daniel.r.heiniger.pieces.GamePiece;
import com.gmail.daniel.r.heiniger.pieces.LinePiece;
import com.gmail.daniel.r.heiniger.pieces.SquarePiece;

public class Canvas extends JFrame{
	
	public Canvas(){
		initializeDefaultFrame();
		buildInterface();
	}

	private void initializeDefaultFrame() {
		setVisible(true);
		setSize(Engine.BOARD_WIDTH, Engine.BOARD_HEIGHT);
		setTitle("Tetris");
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void buildInterface(){
		JPanel squarePane = new JPanel();
//		addPiece(new SquarePiece());
		addPiece(new LinePiece());
//		getContentPane().add(new JPanel(new Rectangle()));
//		setLayout(new BorderLayout());
//		add(buildScoreComponent(), BorderLayout.CENTER);
	}
	
	private JComponent buildScoreComponent(){
		return new JTextArea();
	}
	
	public void addPiece(GamePiece gamePiece){
		getContentPane().add(gamePiece);
	}
}

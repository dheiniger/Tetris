package com.gmail.daniel.r.heiniger.tetrominoes.composites;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;

import com.gmail.daniel.r.heiniger.engine.Engine;

public class Composite extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private static final int MAX_NUMBER_OF_X_COMPOSITES = 10;
	private static final int MAX_NUMBER_OF_Y_COMPOSITES = 20;
	
	public static final int WIDTH = Engine.BOARD_WIDTH / MAX_NUMBER_OF_X_COMPOSITES;
	public static final int HEIGHT = Engine.BOARD_HEIGHT / MAX_NUMBER_OF_Y_COMPOSITES;
	
	private static final Color DEFAULT_BORDER_COLOR = Color.BLACK;
	
	private Color color;
	private Color borderColor;
	private RelativePosition relativePosition;
	
	
	public Composite(Color color){
		this.color = color;
		this.borderColor = DEFAULT_BORDER_COLOR;
		this.relativePosition = getRelativePosition(DefaultPosition.POSITION_ZERO);
	}
	
	public Composite(Color color, DefaultPosition defaultPosition){
		this.color = color;
		this.borderColor = DEFAULT_BORDER_COLOR;
		this.relativePosition = getRelativePosition(defaultPosition);
	}
	
	public Composite(Color color, Color borderColor, DefaultPosition defaultPosition){
		this.color = color;
		this.borderColor = borderColor;
		this.relativePosition = getRelativePosition(defaultPosition);
	}
	
	public Composite(Composite composite){
		this.color = composite.color;
		this.borderColor = composite.borderColor;
		this.relativePosition = new RelativePosition(composite.relativePosition);
	}
	
	public RelativePosition getRelativePosition(){
		return this.relativePosition;
	}
	
	private RelativePosition getRelativePosition(DefaultPosition defaultPosition){
		RelativePosition relativePosition = new RelativePosition(defaultPosition.ordinal(), 
																 defaultPosition.getPosition());
		return relativePosition;
	}

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle compositeSquare = new Rectangle(relativePosition.getX(), 
												  relativePosition.getY(), WIDTH, HEIGHT);
		g2.setColor(this.borderColor);
		g2.draw(compositeSquare);
		g2.setColor(this.color);
		g2.fill(compositeSquare);
	}
	
	@Override
	public boolean equals(Object rhs){
		Composite comparedComposite = (Composite) rhs;
		return this.color.equals(comparedComposite.color) &&
				this.borderColor.equals(comparedComposite.borderColor) &&
				this.relativePosition.equals(comparedComposite.getRelativePosition());
	}
}

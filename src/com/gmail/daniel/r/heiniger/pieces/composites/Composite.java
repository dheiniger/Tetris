package com.gmail.daniel.r.heiniger.pieces.composites;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JTextField;

import com.gmail.daniel.r.heiniger.engine.Engine;

public class Composite extends JPanel{
	public static final int WIDTH = 50 * Engine.SCALE;
	public static final int HEIGHT = 50 * Engine.SCALE;
	private static final Color DEFAULT_BORDER_COLOR = Color.BLACK;
	
	private Color color;
	private Color borderColor;
	private Position position;
	
	public Composite(Color color){
		this.color = color;
		this.borderColor = DEFAULT_BORDER_COLOR;
		this.position = new Position();
	}
	
	public Composite(Color color, Position position){
		this.color = color;
		this.borderColor = DEFAULT_BORDER_COLOR;
		this.position = position;
	}
	
	public Composite(Color color, Color borderColor, Position position){
		this.color = color;
		this.borderColor = borderColor;
		this.position = position;
	}

	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle piece = new Rectangle(position.getX(), position.getY(), WIDTH, HEIGHT);
		g2.setColor(this.borderColor);
		g2.draw(piece);
		g2.setColor(this.color);
		g2.fill(piece);
	}

}

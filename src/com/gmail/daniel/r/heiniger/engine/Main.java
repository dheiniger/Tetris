package com.gmail.daniel.r.heiniger.engine;

import javax.swing.SwingUtilities;

import com.gmail.daniel.r.heiniger.pieces.LinePiece;
import com.gmail.daniel.r.heiniger.view.Canvas;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Canvas();	
			}
		});
	}

}

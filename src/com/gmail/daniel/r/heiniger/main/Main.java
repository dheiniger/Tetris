package com.gmail.daniel.r.heiniger.main;

import com.gmail.daniel.r.heiniger.view.Canvas;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(Canvas::new);
	}
}

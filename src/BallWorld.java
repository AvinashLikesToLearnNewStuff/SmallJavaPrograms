package com.anUninspiredInsight.programs;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

class BallWorld extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BallPanel panel = new BallPanel(180,180);	
	public BallWorld() {
		Container c = getContentPane();
		c.add(panel, BorderLayout.CENTER);

		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		BallWorld World = new BallWorld();
		World.show();
	}
}

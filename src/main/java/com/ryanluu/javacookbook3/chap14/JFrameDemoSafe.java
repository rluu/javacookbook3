package com.ryanluu.javacookbook3.chap14;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class JFrameDemoSafe {
	public static void main(String[] args) {
		// Creat the GUI (variable is final because used by inner class).
		final JFrame demo = new JFrameDemo();
		
		// Create a Runnable to set the main visible, and get Swing to invoke.
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				demo.setVisible(true);
			}
		});
		
	}
}

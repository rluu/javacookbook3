package com.ryanluu.javacookbook3.chap14;

import javax.swing.JFrame;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class JFrameDemo  extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6328000086184163147L;
	JButton quitButton;
	
	/**
	 * Construct the object including its GUI.
	 * 
	 */
	public JFrameDemo() {
		super("JFrameDemo");
		
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		quitButton = new JButton("Exit");
		cp.add(quitButton);
		
		
		// Set up so that "Close will exit the program,
		// not just close the JFrame.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// This "action handler" will be explained later in the chapter.
		quitButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);
				
			}
		});
		
		pack();
		setLocation(500,400);
		
		
	}
	
	public static void main(String[] args) {
		new JFrameDemo().setVisible(true);
		
		
	}

}

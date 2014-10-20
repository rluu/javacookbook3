package com.ryanluu.javacookbook3.chap14;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameFlowLayout extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4089935715219660296L;

	public JFrameFlowLayout() {
		Container cp = getContentPane();
		
		//FlowLayout layout = new FlowLayout();
		BoxLayout layout = new BoxLayout(cp, BoxLayout.Y_AXIS);
		
		// Make sure it has a FlowLayout layoutmanager.
		cp.setLayout(layout);
		
		JButton yesButton = new JButton("Yes!");
		
		yesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("You clicked on Yes!");
				System.out.println("You clicked on yes (message 2");
				
			}
		});
		
		// Now add Components to "cp"...
		cp.add(new JLabel("Wonderful?"));
		cp.add(yesButton);
		pack();
		
	}
	
	public static void main(String[] args) {
		new JFrameFlowLayout().setVisible(true);
		
	}

}

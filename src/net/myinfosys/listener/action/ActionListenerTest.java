package net.myinfosys.listener.action;

import java.awt.Dimension;

import javax.swing.JFrame;

public class ActionListenerTest {

	public static void main(String [] args){
		JFrame frame = new JFrame("Action Listener");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(new Dimension(300,300));
		frame.setLocationRelativeTo(null);
		frame.add(new PanelAction());
		frame.setVisible(true);
		
	}
}

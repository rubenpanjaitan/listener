package net.myinfosys.listener.container;

import java.awt.Dimension;

import javax.swing.JFrame;

public class ContainerTest {

	public static void main(String [] args){
		JFrame frame = new JFrame("Container Listener");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(new Dimension(300, 300));
		frame.add(new PanelContainer());
		frame.setVisible(true);
		
	}
}

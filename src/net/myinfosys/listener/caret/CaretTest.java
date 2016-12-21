package net.myinfosys.listener.caret;

import java.awt.Dimension;

import javax.swing.JFrame;

public class CaretTest {
	
	public static void main(String [] args){
		JFrame frame = new JFrame("Caret Listener");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(new Dimension(300, 300));
		frame.setLocationRelativeTo(null);
		frame.add(new PanelCaret());
		frame.setVisible(true);
	}
}

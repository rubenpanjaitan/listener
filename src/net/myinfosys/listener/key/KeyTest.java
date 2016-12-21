package net.myinfosys.listener.key;

import java.awt.Dimension;

import javax.swing.JFrame;

public class KeyTest {

	public static void main(String [] args){
		JFrame frame = new JFrame("Key Listener");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(new Dimension(300, 300));
		frame.setLocationRelativeTo(null);
		frame.add(new PanelKey());
		frame.setVisible(true);
	}
}

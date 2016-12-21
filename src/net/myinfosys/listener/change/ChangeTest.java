package net.myinfosys.listener.change;

import java.awt.Dimension;

import javax.swing.JFrame;

public class ChangeTest {

	public static void main(String [] args){
		JFrame frame = new JFrame("Change Listener");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(new Dimension(300,300));
		frame.setLocationRelativeTo(null);
		frame.add(new PanelChange());
		frame.setVisible(true);
	}
}

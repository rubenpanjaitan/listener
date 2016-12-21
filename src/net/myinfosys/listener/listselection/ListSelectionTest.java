package net.myinfosys.listener.listselection;

import java.awt.Dimension;

import javax.swing.JFrame;

public class ListSelectionTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("List Selection Listener");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(new Dimension(300, 300));
		frame.setLocationRelativeTo(null);
		frame.add(new PanelListSelection());
		frame.setVisible(true);
	}

}

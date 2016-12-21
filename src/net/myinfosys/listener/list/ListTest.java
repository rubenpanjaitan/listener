package net.myinfosys.listener.list;

import java.awt.Dimension;

import javax.swing.JFrame;

public class ListTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("List Listener");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(new Dimension(300, 300));
		frame.setLocationRelativeTo(null);
		frame.add(new PanelList());
		frame.setVisible(true);
	}

}

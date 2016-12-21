package net.myinfosys.listener.item;

import java.awt.Dimension;

import javax.swing.JFrame;

public class ItemTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Item Listener");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(new Dimension(300, 300));
		frame.add(new PanelItem());
		frame.setVisible(true);
	}

}

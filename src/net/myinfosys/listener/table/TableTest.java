package net.myinfosys.listener.table;

import java.awt.Dimension;

import javax.swing.JFrame;

public class TableTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Table Model Listener");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(new Dimension(400, 400));
		frame.setLocationRelativeTo(null);
		frame.add(new PanelTable());
		frame.setVisible(true);
	}
}

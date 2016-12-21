package net.myinfosys.listener.mouse;

import java.awt.Dimension;

import javax.swing.JFrame;


public class MouseTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("List Selection Listener");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(new Dimension(400, 400));
		frame.setLocationRelativeTo(null);
		frame.add(new PanelMouse());
		frame.setVisible(true);
	}

}

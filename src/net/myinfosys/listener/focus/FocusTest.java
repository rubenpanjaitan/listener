package net.myinfosys.listener.focus;

import java.awt.Dimension;

import javax.swing.JFrame;

public class FocusTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Focus Listener");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(new Dimension(300, 300));
		frame.add(new PanelFocus());
		frame.setVisible(true);
	}

}

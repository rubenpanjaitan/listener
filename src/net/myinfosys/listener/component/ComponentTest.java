package net.myinfosys.listener.component;

import java.awt.Dimension;

import javax.swing.JFrame;

public class ComponentTest {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Component Listener");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(new Dimension(300, 300));
		frame.add(new PanelComponent());
		frame.setVisible(true);
	}

}

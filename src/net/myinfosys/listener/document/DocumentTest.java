package net.myinfosys.listener.document;

import java.awt.Dimension;

import javax.swing.JFrame;

public class DocumentTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Document Listener");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(new Dimension(300, 300));
		frame.add(new PanelDocument());
		frame.setVisible(true);
	}

}

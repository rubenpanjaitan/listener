package net.myinfosys.listener.key;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelKey extends JPanel implements KeyListener {

	private static final long serialVersionUID = -6824814805165070769L;
	private JLabel lblInfo = new JLabel("Info");
	private JTextField txtInput = new JTextField();
	private JLabel lblText = new JLabel("Text");

	public PanelKey() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GridBagLayout());

		add(txtInput, new GridBagConstraints(0, 0, 1, 1, 0.5, 0.5, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 10), 0, 0));
		txtInput.addKeyListener(this);
		add(lblText, new GridBagConstraints(0, 1, 1, 1, 0.5, 0.5, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 10), 0, 0));
		add(lblInfo, new GridBagConstraints(0, 2, 1, 1, 0.5, 0.5, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 10), 0, 0));
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		lblInfo.setText("Typing :"+e.getKeyChar());
		lblText.setText("Text :"+txtInput.getText());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Pressed :"+e.getKeyChar());
		lblText.setText("Text :"+txtInput.getText());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Released :"+e.getKeyChar());
		lblText.setText("Text :"+txtInput.getText());
	}

}

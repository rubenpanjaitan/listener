package net.myinfosys.listener.focus;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelFocus extends JPanel implements FocusListener {

	private static final long serialVersionUID = 8506423848847181583L;
	private JButton btnOk = new JButton("OK");
	private JButton btnCancel = new JButton("Cancel");
	private JLabel lblInfo = new JLabel("Info");

	public PanelFocus() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GridBagLayout());

		btnOk.addFocusListener(this);
		//btnCancel.addFocusListener(this);
		add(btnOk, new GridBagConstraints(0, 0, 1, 1, 0.5, 0.5, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(10, 10, 10, 10), 0, 0));
		add(btnCancel, new GridBagConstraints(1, 0, 1, 1, 0.5, 0.5, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(10, 10, 10, 10), 0, 0));
		add(lblInfo, new GridBagConstraints(1, 1, 1, 1, 0.5, 0.5, GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(0, 0, 0, 0), 0, 0));
	}

	@Override
	public void focusGained(FocusEvent e) {
		lblInfo.setText("focus ok");
	}

	@Override
	public void focusLost(FocusEvent e) {
		lblInfo.setText("lost focus ok");
	}

}

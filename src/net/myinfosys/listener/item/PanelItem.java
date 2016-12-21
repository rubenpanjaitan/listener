package net.myinfosys.listener.item;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelItem extends JPanel implements ItemListener {
	private static final long serialVersionUID = 8135119506043303008L;
	private JCheckBox cbWindows = new JCheckBox("Windows");
	private JCheckBox cbApple = new JCheckBox("Apple");
	private JCheckBox cbLinux = new JCheckBox("Linux");
	private JLabel lblInfo = new JLabel("Info");
	private String [] arrOs = {"Windows","Apple","Linux"};
	private JComboBox<String> cmbOs= new JComboBox<String>(arrOs);
	public PanelItem() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GridBagLayout());
		
		cbWindows.addItemListener(this);
		add(cbWindows, new GridBagConstraints(0, 0, 1, 1, 0.5, 0.5, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 10), 0, 0));
		add(cbApple, new GridBagConstraints(2, 0, 1, 1, 0.5, 0.5, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 10), 0, 0));
		add(cbLinux, new GridBagConstraints(4, 0, 1, 1, 0.5, 0.5, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 10), 0, 0));
		cmbOs.addItemListener(this);
		add(cmbOs, new GridBagConstraints(2, 1, 1, 1, 0.5, 0.5, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 10), 0, 0));
		add(lblInfo, new GridBagConstraints(2, 2, 1, 1, 0.5, 0.5, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 10), 0, 0));

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		lblInfo.setText("Windows");
		if(e.getSource()==cmbOs){
			lblInfo.setText(e.getItem().toString());
		}
	}

}

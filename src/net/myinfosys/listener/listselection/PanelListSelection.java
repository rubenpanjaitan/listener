package net.myinfosys.listener.listselection;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PanelListSelection extends JPanel implements ListSelectionListener {

	private static final long serialVersionUID = 582497067540848708L;
	private JLabel lblInfo = new JLabel("Info");
	private JButton btnAdd = new JButton("Add");
	private JTextField txtValue = new JTextField();
	private DefaultListModel<String> model = new DefaultListModel<String>();
	private JList<String> listValue = new JList<String>(model);

	public PanelListSelection() {
		init();
	}

	private void init() {
		model.addElement("A");
		model.addElement("B");
		model.addElement("C");

		setLayout(new GridBagLayout());
		listValue.addListSelectionListener(this);
		
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				model.addElement(txtValue.getText());
			}
		});
		
		add(txtValue, new GridBagConstraints(0, 0, 1, 1, 0.5, 0.5, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 10), 0, 0));
		add(btnAdd, new GridBagConstraints(1, 0, 1, 1, 0.5, 0.5, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 10), 0, 0));
		add(listValue, new GridBagConstraints(0, 1, 2, 1, 0.5, 0.5, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 10), 0, 0));
		add(lblInfo, new GridBagConstraints(0, 2, 1, 1, 0.5, 0.5, GridBagConstraints.CENTER,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 10), 0, 0));
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		txtValue.setText(model.getElementAt(listValue.getSelectedIndex()));
	}

}

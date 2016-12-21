package net.myinfosys.listener.list;

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
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

public class PanelList extends JPanel implements ListDataListener {

	private static final long serialVersionUID = -4583423352709895053L;

	private JLabel lblInfo = new JLabel("Info");
	private DefaultListModel<String> model = new DefaultListModel<String>();
	private JList<String> jlNilai = new JList<String>(model);
	private JTextField txtNilai = new JTextField();
	private JButton btnAdd = new JButton("Add");

	public PanelList() {
		initcomponents();
	}

	private void initcomponents() {
		setLayout(new GridBagLayout());
		model.addElement("A");
		model.addElement("B");
		model.addElement("C");
		model.addElement("D");

		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				model.addElement(txtNilai.getText());
			}
		});

		model.addListDataListener(this);
		add(txtNilai, new GridBagConstraints(0, 0, 1, 1, 0.5, 0.5, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 10), 0, 0));
		add(btnAdd, new GridBagConstraints(1, 0, 1, 1, 0.5, 0.5, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 10), 0, 0));
		add(jlNilai, new GridBagConstraints(0, 2, 2, 1, 0.5, 0.5, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 10), 0, 0));
		add(lblInfo, new GridBagConstraints(0, 3, 1, 1, 0.5, 0.5, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 10), 0, 0));
	}

	@Override
	public void intervalAdded(ListDataEvent e) {
		lblInfo.setText(txtNilai.getText());
		System.out.println(e.getIndex0());
	}

	@Override
	public void intervalRemoved(ListDataEvent e) {
		
	}

	@Override
	public void contentsChanged(ListDataEvent e) {
		lblInfo.setText(txtNilai.getText());
	}
}

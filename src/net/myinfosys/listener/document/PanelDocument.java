package net.myinfosys.listener.document;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PanelDocument extends JPanel implements DocumentListener {

	private static final long serialVersionUID = -8608852526719120553L;
	private JTextArea txtAdrress = new JTextArea(5, 10);
	private JLabel lblInfo = new JLabel("Info");

	public PanelDocument() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new BorderLayout());
		
		txtAdrress.getDocument().addDocumentListener(this);
		add(txtAdrress,BorderLayout.PAGE_START);
		add(lblInfo,BorderLayout.PAGE_END);
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		lblInfo.setText("inserted 1:"+txtAdrress.getText().length()+"-index :"+e.getOffset());
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		lblInfo.setText("remove 1:"+ txtAdrress.getText().length());
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		lblInfo.setText("change");
	}

}

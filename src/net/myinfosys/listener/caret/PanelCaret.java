package net.myinfosys.listener.caret;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class PanelCaret extends JPanel implements CaretListener{

	private static final long serialVersionUID = 7995735844476350950L;
	private JTextArea txtAddress= new JTextArea(5,10);
	private JLabel lblInfo = new JLabel("Info");
	
	public PanelCaret(){
		setLayout(new BorderLayout());
		
		txtAddress.addCaretListener(this);
		add(txtAddress,BorderLayout.NORTH);
		add(lblInfo,BorderLayout.SOUTH);
	}


	@Override
	public void caretUpdate(CaretEvent e) {
		lblInfo.setText(txtAddress.getText());
	}
	
}

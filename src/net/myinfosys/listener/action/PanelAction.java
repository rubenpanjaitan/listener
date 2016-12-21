package net.myinfosys.listener.action;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PanelAction extends JPanel implements ActionListener{

	private static final long serialVersionUID = 3526254323656594798L;
	private JTextArea txtAddrees = new JTextArea(5,5);
	private JButton btnClick = new JButton("Click");
	public PanelAction(){
		initComponents();
	}

	private void initComponents() {
		setLayout(new BorderLayout());
		txtAddrees.setLineWrap(true);
		
		btnClick.addActionListener(this);
		add(new JScrollPane(txtAddrees),BorderLayout.PAGE_START);
		add(btnClick,BorderLayout.PAGE_END);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		txtAddrees.append("Click!\n");
	}
}

package net.myinfosys.listener.component;

import java.awt.BorderLayout;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelComponent extends JPanel implements ComponentListener  {

	private static final long serialVersionUID = 7319943180062890753L;
	private JLabel lblInfo = new JLabel("Info");
	private JCheckBox  cb = new JCheckBox("Visible");
	private JButton btnAdd = new JButton("Add");
	
	public PanelComponent(){
		initComponents();
	}

	private void initComponents() {
		setLayout(new BorderLayout());
		
		cb.addComponentListener(this);
		
		add(cb,BorderLayout.NORTH);
		add(btnAdd,BorderLayout.CENTER);
		add(lblInfo,BorderLayout.SOUTH);
	}

	@Override
	public void componentResized(ComponentEvent e) {
		lblInfo.setText(e.getSource().getClass().getName()+" Resized");
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		
	}

}

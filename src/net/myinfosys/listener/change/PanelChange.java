package net.myinfosys.listener.change;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class PanelChange extends JPanel implements ChangeListener {
	private static final long serialVersionUID = 5624903245141403615L;
	JSlider slider = new JSlider(0, 100);
	JLabel lblInfo = new JLabel("Info");
	
	public PanelChange() {
		initComponents();
	}
	
	private void initComponents() {
		setLayout(new BorderLayout());
		
		slider.addChangeListener(this);
		add(slider, BorderLayout.CENTER);
		add(lblInfo,BorderLayout.SOUTH);
	}


	@Override
	public void stateChanged(ChangeEvent e) {
		Integer value = slider.getValue();
		lblInfo.setText(value.toString());
	}

}

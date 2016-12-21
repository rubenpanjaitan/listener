package net.myinfosys.listener.container;

import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelContainer extends JPanel implements ContainerListener {

	private static final long serialVersionUID = 5575667640506643976L;
	JButton btn = new JButton("Button");

	public PanelContainer() {
		initComponents();
	}

	private void initComponents() {
		add(btn);
	}

	@Override
	public void componentAdded(ContainerEvent e) {
		displayMessage("added", e);
	}

	@Override
	public void componentRemoved(ContainerEvent e) {
		displayMessage("removed", e);
	}
	
	void displayMessage(String action, ContainerEvent e) {
        System.out.println(((JButton) e.getChild()).getText() + " was" + action
            + e.getContainer().getClass().getName());
      }

}

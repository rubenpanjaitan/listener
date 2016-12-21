package net.myinfosys.listener.mouse;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMouse extends JPanel implements MouseListener, MouseMotionListener {

	private static final long serialVersionUID = -3317997535621578185L;
	private JLabel lblInfo = new JLabel("Click : 0");
	private JLabel lblClick = new JLabel("Click Here!!");
	private JLabel lblDrag = new JLabel("Drag this!!");
	private int count = 0;

	public PanelMouse() {
		init();
	}

	private void init() {
		setLayout(new BorderLayout());
		lblClick.setFont(lblClick.getFont().deriveFont(Font.BOLD, 16));
		lblDrag.setForeground(Color.BLUE);
		lblClick.addMouseListener(this);
		lblDrag.addMouseMotionListener(this);
		add(lblDrag, BorderLayout.PAGE_START);
		add(lblClick, BorderLayout.CENTER);
		add(lblInfo, BorderLayout.PAGE_END);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		lblInfo.setText("Click :" + count++);
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println(e.getXOnScreen());
	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("drag");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

}

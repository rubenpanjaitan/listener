package net.myinfosys.listener.table;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

public class PanelTable extends JPanel implements TableModelListener{

	private static final long serialVersionUID = -3404765805456072068L;
	private String[] arrColumn = { "A", "B", "C" };
	private Object[][] obj = { { "a", "aa", "aaa" }, { "b", "bb", "bbb" }, { "c", "cc", "ccc" } };
	private JTable table = new JTable(obj, arrColumn);
	private JLabel lblInfo = new JLabel("Info");

	public PanelTable() {
		init();
	}

	private void init() {
		setLayout(new BorderLayout());
		
		add(new JScrollPane(table), BorderLayout.CENTER);
		add(lblInfo, BorderLayout.PAGE_END);
	}

	@Override
	public void tableChanged(TableModelEvent e) {
		System.out.println(table.getSelectedRow());
	}

}

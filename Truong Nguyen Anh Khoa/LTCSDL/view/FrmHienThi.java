package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.DungChung;

import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmHienThi extends JFrame {

	private JPanel contentPane;
	private JTable table;
	DungChung dc = new DungChung();
	JList list = new JList();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmHienThi frame = new FrmHienThi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmHienThi() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				try {
					dc.KetNoi();
					table.setModel(dc.napbang("donvi"));
					DefaultListModel<String> mh = new DefaultListModel<String>();
					ResultSet rs = dc.getbang("[INFORMATION_SCHEMA].[TABLES]");
					while(rs.next()) {
						mh.addElement(rs.getString(3));
						list.setModel(mh);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(237, 208, 527, 257);
		contentPane.add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("New tab", null, scrollPane, null);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					String tb = list.getSelectedValue().toString();
					table.setModel(dc.napbang(tb));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		list.setBounds(10, 164, 211, 301);
		contentPane.add(list);
	}
}

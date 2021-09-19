package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import bo.donvibo;
import bo.nhanvienbo;
import dao.DungChung;
import dao.nhanviendao;

import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmVIEW extends JFrame {

	private JPanel contentPane;
	private JTable table;
	nhanvienbo nvbo=new nhanvienbo();
	donvibo dvbo = new donvibo();
	DungChung dc=new DungChung();
	private JTextField txtmanv;
	private JTextField txthoten;
	private JTextField txtgioitinh;
	private JTextField txtngaysinh;
	private JTextField txthsl;
	private JTextField txtmadv;
	private JTextField timten;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmVIEW frame = new FrmVIEW();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	void napbangtim (ResultSet rs) {
		try {
			DefaultTableModel mh = new DefaultTableModel();
			mh.addColumn("MaNv");mh.addColumn("HoTen");mh.addColumn("GioiTinh"); 
			mh.addColumn("NgaySinh");mh.addColumn("HSL");mh.addColumn("Madv");
			while (rs.next()) {
				Object [] t = new Object [6];
				t[0]=rs.getString("MaNv");
				t[1]=rs.getString("Hoten");
				t[2]=rs.getString("GioiTinh");
				t[3]=rs.getString("NgaySinh");
				t[4]=rs.getString("HSL");
				t[5]=rs.getString("Madv");
				mh.addRow(t);
			} table.setModel(mh); rs.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	/**
	 * Create the frame.
	 */
	public FrmVIEW() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				try {
					nvbo.getnv();
					table.setModel(nvbo.napbang("NhanVien"));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(340, 244, 502, 240);
		contentPane.add(tabbedPane);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("New tab", null, scrollPane, null);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int d = table.getSelectedRow();
				String ma = table.getValueAt(d, 0).toString();
				String ht = table.getValueAt(d, 1).toString();
				String gt = table.getValueAt(d, 2).toString();
				String ns = table.getValueAt(d, 3).toString();
				String hsl = table.getValueAt(d, 4).toString();
				String madv = table.getValueAt(d, 5).toString();
				txtmanv.setText(ma);
				txthoten.setText(ht);
				Double t = new Double(gt);
				if(t == 1)
					txtgioitinh.setText("Nam");
				else
					txtgioitinh.setText("Nữ");
				txtngaysinh.setText(ns);
				txthsl.setText(hsl);
				txtmadv.setText(madv);
				
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Manv");
		btnNewButton.setBounds(28, 278, 89, 23);
		contentPane.add(btnNewButton);
		
		txtmanv = new JTextField();
		txtmanv.setBounds(121, 279, 209, 20);
		contentPane.add(txtmanv);
		txtmanv.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Hoten");
		btnNewButton_1.setBounds(28, 312, 89, 23);
		contentPane.add(btnNewButton_1);
		
		txthoten = new JTextField();
		txthoten.setBounds(121, 313, 209, 20);
		contentPane.add(txthoten);
		txthoten.setColumns(10);
		
		txtgioitinh = new JTextField();
		txtgioitinh.setBounds(121, 347, 209, 20);
		contentPane.add(txtgioitinh);
		txtgioitinh.setColumns(10);
		
		txtngaysinh = new JTextField();
		txtngaysinh.setBounds(121, 378, 209, 20);
		contentPane.add(txtngaysinh);
		txtngaysinh.setColumns(10);
		
		txthsl = new JTextField();
		txthsl.setBounds(121, 409, 209, 20);
		contentPane.add(txthsl);
		txthsl.setColumns(10);
		
		txtmadv = new JTextField();
		txtmadv.setBounds(121, 440, 209, 22);
		contentPane.add(txtmadv);
		txtmadv.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Gioitinh");
		btnNewButton_2.setBounds(28, 346, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Ngaysinh");
		btnNewButton_3.setBounds(28, 377, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Hsl");
		btnNewButton_4.setBounds(28, 408, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Madv");
		btnNewButton_5.setBounds(28, 440, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Add");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String manv = txtmanv.getText();
					String hoten = txthoten.getText();
					Boolean gioitinh = Boolean.parseBoolean(txtgioitinh.getText());
					SimpleDateFormat dd= new SimpleDateFormat("yyyy-MM-dd");
					Date ngaysinh = dd.parse(txtngaysinh.getText());
					Double hsl= Double.parseDouble(txthsl.getText());
					String maDv = txtmadv.getText();
					
					if(nvbo.Them(manv, hoten, gioitinh, ngaysinh, hsl, maDv) == 0)
						JOptionPane.showMessageDialog(null, "trung ma");
					else {
						nvbo.Them(manv, hoten, gioitinh, ngaysinh, hsl, maDv);
						table.setModel(nvbo.napbang("NhanVien"));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton_6.setBounds(28, 11, 89, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Save");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String manv = txtmanv.getText();
					String hoten = txthoten.getText();
					Boolean gioitinh = Boolean.parseBoolean(txtgioitinh.getText());
					//chuyen ngay sang chuoi
					
					SimpleDateFormat dd= new SimpleDateFormat("yyyy-MM-dd");
					Date ngaysinh = dd.parse(txtngaysinh.getText());
					Double hsl= Double.parseDouble(txthsl.getText());
					String maDv = txtmadv.getText();
					nvbo.CapNhat(manv, hoten, gioitinh, ngaysinh, hsl, maDv);
					table.setModel(nvbo.napbang("NhanVien"));
					}
				 catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton_7.setBounds(28, 45, 89, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Delete");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int t = JOptionPane.showConfirmDialog(null, "Bạn có chắc xóa dữ liệu ?");
							if(t == 0)
							{
								String manv = txtmanv.getText();
								nvbo.Xoa(manv);
								table.setModel(nvbo.napbang("NhanVien"));
							}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnNewButton_8.setBounds(28, 79, 89, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Tìm");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					nhanviendao nv = new nhanviendao();
					ResultSet rs = nv.Tim(timten.getText().toString());
					napbangtim(rs);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton_9.setBounds(387, 45, 89, 23);
		contentPane.add(btnNewButton_9);
		
		timten = new JTextField();
		timten.setBounds(257, 12, 219, 20);
		contentPane.add(timten);
		timten.setColumns(10);
	}
}

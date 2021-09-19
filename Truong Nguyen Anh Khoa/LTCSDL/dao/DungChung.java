package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.table.DefaultTableModel;

public class DungChung {
	public static Connection cn;
	public void KetNoi() throws Exception{
		//b1: Xác định HQTCSDL
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		System.out.println("Da xac dinh HQTCSDL");
		//b2 ket noi vao csdl
		String url = "jdbc:sqlserver://DESKTOP-D3KKHSJ\\SQLEXPRESS:1433;databaseName=qlnv;\r\n" + 
				"user=sa; password=09052000";
		cn = DriverManager.getConnection(url);
		System.out.println("Da ket noi");
	}
	public ResultSet getbang(String tb) throws Exception{
		//tao câu lệnh sql
		String sql = "select * from "+tb;
		
		//tao cau lenh
		PreparedStatement cmd= cn.prepareStatement(sql);
		//cho thuc hien cau lenh
		ResultSet rs = cmd.executeQuery();
		return rs;
	}
	public DefaultTableModel napbang(String tb) throws Exception{
		DefaultTableModel mh = new DefaultTableModel();
		//lay du lieu bang tb
		ResultSet  rs = getbang(tb);
		//lay ra metadata cua rs;
		ResultSetMetaData mt =  rs.getMetaData();
		//lay ra so cot cot
		int socot = mt.getColumnCount();
		//lay ra ten cot
		for(int i=1; i<=socot;i++)
			mh.addColumn(mt.getColumnName(i));
		//duyet qua es de nap cac dong vao mo hinh
		while(rs.next()) {
			Object[] t = new Object[socot];
			for(int i = 1; i<=socot;i++)
				t[i-1]=rs.getString(i);
			mh.addRow(t);
		}
		return mh;
	}
}

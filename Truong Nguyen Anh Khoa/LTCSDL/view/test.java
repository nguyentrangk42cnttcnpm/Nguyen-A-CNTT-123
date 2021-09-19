package view;

import java.sql.ResultSet;

import dao.DungChung;
public class test {
	public static void main(String[] args) {
		try {
			DungChung dc = new DungChung();
			dc.KetNoi();
			ResultSet rs = dc.getbang("NhanVien");
			//duyet qua du lieu
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getBoolean(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getFloat(5));
				System.out.println(rs.getString(6));
				System.out.println("------------");
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import bean.donvibean;
public class donvidao {
	DungChung dc = new DungChung();
	//viet ham tra e cac don vi
	public ArrayList<donvibean> getdv() throws Exception{
		dc.KetNoi();
		//ds luu lai cac dv
		ArrayList<donvibean> ds = new ArrayList<donvibean>();
		//tao ra cau lenh SQL de lay ve all dv
		String sql = "select * from donvi";
		//tao PreparedStatement
		PreparedStatement cmd =DungChung.cn.prepareStatement(sql);
		//cho thuc hien cau lenh tra ve resultset : rs
		ResultSet rs= cmd.executeQuery();
		//duyet rs
		while(rs.next()) {
			String madv = rs.getString("madv");
			String tendv = rs.getString("tendv");
			donvibean dv = new donvibean(madv, tendv);
			ds.add(dv);
		}
		//dong rs
		rs.close();
		
		return ds;
	}

}

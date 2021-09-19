package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import bean.NhanVienBean;
import bean.donvibean;
public class nhanviendao {
	DungChung dc = new DungChung();
	public ArrayList<NhanVienBean> getnv()throws Exception{
		dc.KetNoi();
		ArrayList<NhanVienBean> ds = new ArrayList<NhanVienBean>();
		//tao ra cau lenh SQL de lay ve all dv
		String sql = "select * from	NhanVien";
		//tao PreparedStatement
		PreparedStatement cmd =DungChung.cn.prepareStatement(sql);
		//cho thuc hien cau lenh tra ve resultset : rs
		ResultSet rs= cmd.executeQuery();
		//duyet rs
		while(rs.next()) {
			String manv = rs.getString("Manv");
			String hoten = rs.getString("Hoten");
			Boolean gioitinh = rs.getBoolean("gioitinh");
			Date ngaysinh = rs.getDate("Ngaysinh");
			Double hsl=rs.getDouble("Hsl");
			String maDv =rs.getString("MaDv");
			
			NhanVienBean dv = new NhanVienBean(manv, hoten, gioitinh, ngaysinh, hsl, maDv);
			ds.add(dv);
		}
		//dong rs
		rs.close();
		
		return ds;
	}
	public int Them(String manv, String hoten, Boolean gioitinh, Date ngaysinh, Double hsl, String maDv)throws Exception {
		//tao cau lenh sql
		String sql =" insert into NhanVien (Manv,Hoten,gioitinh,Ngaysinh,Hsl,MaDv) values (?,?,?,?,?,?) ";

		//tao ra PreparedStatement
		PreparedStatement cmd = DungChung.cn.prepareStatement(sql);
		//truyen tham so neu co
		cmd.setString(1, manv);cmd.setString(2, hoten);
		cmd.setBoolean(3, gioitinh);
		cmd.setDate(4, new java.sql.Date(ngaysinh.getDate()));
		cmd.setDouble(5, hsl);
		cmd.setString(6, maDv);
		//thuc hien cau lenh
		return cmd.executeUpdate();
	}
	public int CapNhat(String manv, String hoten, Boolean gioitinh, Date ngaysinh, Double hsl, String maDv)throws Exception {
		//tao cau lenh sql
		String sql =" update NhanVien set	Hoten =?, gioitinh =?, Ngaysinh=?, Hsl=?, MaDv=? where Manv=? ";

		//tao ra PreparedStatement
		PreparedStatement cmd = DungChung.cn.prepareStatement(sql);
		//truyen tham so neu co
		cmd.setString(6, manv);cmd.setString(1, hoten);
		cmd.setBoolean(2, gioitinh);
		cmd.setDate(3, new java.sql.Date(ngaysinh.getTime()));
		cmd.setDouble(4, hsl);
		cmd.setString(5, maDv);
		//thuc hien cau lenh
		return cmd.executeUpdate();
	}
	public int Xoa(String manv)throws Exception {
		//tao cau lenh sql
		String sql =" delete from NhanVien where Manv = ? ";

		//tao ra PreparedStatement
		PreparedStatement cmd = DungChung.cn.prepareStatement(sql);
		//truyen tham so neu co
		cmd.setString(1, manv);
		//thuc hien cau lenh
		return cmd.executeUpdate();
	}
	public ResultSet Tim(String ten) throws Exception {
		
			String sql = "Select * from NhanVien where Hoten like ?";
			PreparedStatement cmd = DungChung.cn.prepareStatement(sql);
			cmd.setString(1, "%"+ten+"%");
			 
			return cmd.executeQuery();
			
		}
		
	}



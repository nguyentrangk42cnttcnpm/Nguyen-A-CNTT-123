package bo;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.table.DefaultTableModel;

import bean.NhanVienBean;
import dao.DungChung;
import dao.nhanviendao;
public class nhanvienbo {
	nhanviendao nvdao =  new nhanviendao();
	ArrayList<NhanVienBean> ds;
	public ArrayList<NhanVienBean> getnv() throws Exception{
		ds=nvdao.getnv();
		return ds;
	}
	public ArrayList<NhanVienBean> TimMadv(String madv) throws Exception{
		ArrayList<NhanVienBean> tam = new ArrayList<NhanVienBean>();
		for(NhanVienBean nv : ds) {
			if(nv.getMaDv().equals(madv))
				tam.add(nv);
		}
		return tam;
	}
	public int Them(String manv, String hoten, Boolean gioitinh, Date ngaysinh, Double hsl, String maDv)throws Exception {
		//kt trung ma
		for(NhanVienBean n:ds)
			if(n.getManv().equals(manv))
			 return 0;
		//them vao bo nho
		NhanVienBean nv =new NhanVienBean(manv, hoten, gioitinh, ngaysinh, hsl, maDv);
		ds.add(nv);
		//them vao csdl
		return nvdao.Them(manv, hoten, gioitinh, ngaysinh, hsl, maDv);
		
	}
	public int CapNhat(String manv, String hoten, Boolean gioitinh, Date ngaysinh, Double hsl, String maDv)throws Exception{
		
		return nvdao.CapNhat(manv, hoten, gioitinh, ngaysinh, hsl, maDv);
	}
	public int Xoa(String manv)throws Exception {
		return nvdao.Xoa(manv);
	}
	public DefaultTableModel napbang(String tb) throws Exception{
		DungChung dc = new DungChung();
		return dc.napbang(tb);
	}
	
	
}

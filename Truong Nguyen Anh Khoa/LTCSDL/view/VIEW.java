package view;

import  java.sql.ResultSet;
import java.util.ArrayList;

import bean.NhanVienBean;
import bean.donvibean;
import bo.donvibo;
import bo.nhanvienbo;

public class VIEW {
	public static void main(String[] args) {
		try {
			donvibo dv = new donvibo();
			ArrayList<donvibean> dvbo = dv.getdv();
			for(donvibean d :dvbo)
				System.out.println(d.getTendv());
			nhanvienbo nvbo = new nhanvienbo();
			for(NhanVienBean nv : nvbo.getnv())
				System.out.println(nv.getHoten());
			//tim kiem
			for(NhanVienBean nv : nvbo.TimMadv("CNTT"))
				System.out.println(nv.getHoten());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

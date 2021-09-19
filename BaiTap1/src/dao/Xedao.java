package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

import bean.XeDapbean;
import bean.XeMaybean;
import bean.XeOTobean;

public class Xedao {
	public ArrayList<String> xedap = new ArrayList<String>();
	public ArrayList<String> xemay = new ArrayList<String>();
	public ArrayList<String> xeoto = new ArrayList<String>();
	public ArrayList<Object> list = new ArrayList<Object>(); 
//	String[] array ;
	public ArrayList<Object> getXe() {
		
		try {
			FileReader f = new FileReader("data.txt");
			BufferedReader r = new BufferedReader(f);
			while (true) {
				String st = r.readLine();
				if (st == "" || st == null)
					break;
				String[] t = st.split("[;]");
				int loai = Integer.parseInt(t[0]);
				if (loai == 0) {
					XeDapbean xd = new XeDapbean(Integer.parseInt(t[0]), Integer.parseInt(t[2]), t[3], "", 0);
					xedap.add(xd.getChiTiet());
				}
				if (loai == 2) {
					XeMaybean xm = new XeMaybean(Integer.parseInt(t[0]), t[1], t[3], "", 0);
					xemay.add(xm.getChiTiet());
				}
				if (loai == 4) {
					XeOTobean xoto = new XeOTobean(Integer.parseInt(t[0]), t[1], t[3], "", t[4], "", 0);
					xeoto.add(xoto.getChiTiet());
					
				}
			}
			r.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		list.add(xedap);
		list.add(xemay);
		list.add(xeoto);
		return list;
	}

}

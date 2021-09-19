package SINHVIEN;


import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;



public class QuanLySinhVien {
	public ArrayList<Object> ds1 = new ArrayList<Object>();
	public void TaoBang(String a)
	{	
		try {
			FileReader f = new FileReader(a);
			BufferedReader r = new BufferedReader(f);
			while(true)
			{
				String st = r.readLine();
				if(st == null || st == "") break;
				String[] t = st.split("[|]");
				if(t.length==4)
				{
					TinA tin = new TinA();
					tin.setMaSv(t[0]);
					tin.setHoTen(t[1]);
					tin.setDwin(Double.parseDouble(t[2]));
					tin.setDword(Double.parseDouble(t[3]));
					ds1.add(tin);
				}
				if(t.length==5)
				{
					TinB tin = new TinB();
					tin.setMaSv(t[0]);
					tin.setHoTen(t[1]);
					tin.setDex(Double.parseDouble(t[2]));
					tin.setDpow(Double.parseDouble(t[3]));
					tin.setDweb(Double.parseDouble(t[4]));
					ds1.add(tin);
					
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public ArrayList<Object> HocVienTinA(){
		ArrayList<Object> t = new ArrayList<Object>();
		for (Object o: ds1) {
			if (o instanceof TinA) t.add(o);
		}
		return t;
	}
	
	public ArrayList<Object> HocVienTinB(){
		ArrayList<Object> t = new ArrayList<Object>();
		for (Object o: ds1) {
			if (o instanceof TinB) t.add(o);
		}
		return t;
	}
	
	public ArrayList<Object> TimKiem(String ten)
	{
		ArrayList<Object> arr = new ArrayList<Object>();
		int x=0;
		for(Object tin:ds1)
		{
			if (tin instanceof TinA && ((TinA)tin).getHoTen().trim().toLowerCase().contains(ten.trim().toLowerCase())) 
				{
				arr.add(tin);
				x++;
				}
			if (tin instanceof TinB && ((TinB)tin).getHoTen().trim().toLowerCase().contains(ten.trim().toLowerCase())) 
				{
				arr.add(tin);
				x++;
				}
			
		}
		if(x==0)
			System.out.println("Khong co ten can tim!");
		return arr;
	}
	public void HienThi()
	{
		System.out.println("Danh Sach Sinh Vien :");
		for(Object tin:ds1)
		{
		
			if(tin instanceof TinA)
			{
				TinA tin1 =(TinA)tin;
				tin1.HienThi();
			}
			
			if(tin instanceof TinB)
			{
				TinB tin1 =(TinB)tin;
				tin1.HienThi();
			}
		}
	}
	public void In(ArrayList<Object> ds)
	{
		for( Object ds1 : ds)
		{
			if(ds1 instanceof TinA) 
				((TinA) ds1).HienThi();
			if(ds1 instanceof TinB )
				((TinB) ds1).HienThi();

		}
	}
	public void Tao2file(){
		try {
			FileOutputStream f1 = new FileOutputStream("f1.txt");
			OutputStreamWriter r1 = new OutputStreamWriter(f1);
			PrintWriter i1 = new PrintWriter(r1);
			
			FileOutputStream f2 = new FileOutputStream("f2.txt");
			OutputStreamWriter r2 = new OutputStreamWriter(f2);
			PrintWriter i2 = new PrintWriter(r2);
			
			FileReader f = new FileReader("ds.txt");
			BufferedReader r = new BufferedReader(f);
			while(true){
				String st = r.readLine();
				if(st == "" || st == null) break;
				String[] t = st.split("[|]");
				if(t.length == 4 )
				i1.println(t[0]+";"+t[1]+";"+Double.parseDouble(t[2])+";"+Double.parseDouble(t[3]));
				if(t.length == 5)
					i2.println(t[0]+";"+t[1]+";"+Double.parseDouble(t[2])+";"+Double.parseDouble(t[3])+";"+Double.parseDouble(t[4]));
			}
			r.close();
			i1.close();
			i2.close();
			System.out.println("Da tao xong 2 file ! ");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		QuanLySinhVien sv = new QuanLySinhVien();
		sv.TaoBang("ds.txt");
		sv.HienThi();
		
		Scanner n = new Scanner(System.in);
		System.out.println("Nhap ten can tim:");
		String ten = n.nextLine();
		sv.In(sv.TimKiem(ten));
		sv.Tao2file();
		
	}
}

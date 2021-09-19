package bean;

public class XeDapbean extends ChiTietbean {
	protected int sovexe;
	public XeDapbean(int loaixe, int sovexe, String tgianvao, String tgianra, float tienthue) {
		// TODO Auto-generated constructor stub
		super(loaixe,tgianvao,tgianra,tienthue);
		this.sovexe = sovexe;
	}
	public String getChiTiet() {
		String xe = "\nXeDapbean ["
						+ "sovexe=" + sovexe + ", "
						+ "loaixe=" + loaixe + ", "
						+ "tgianvao=" + tgianvao + ", "
						+ "tgianra=" + tgianra + ", "
						+ "tienthue=" + tienthue 
						+ "]"+"\n";
		return xe;
	}
	
}

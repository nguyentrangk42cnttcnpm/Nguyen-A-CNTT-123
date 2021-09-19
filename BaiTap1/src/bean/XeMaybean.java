package bean;

public class XeMaybean extends ChiTietbean {
	protected String bienso;
	public XeMaybean(int loaixe, String bienso, String tgianvao, String tgianra, float tienthue) {
		// TODO Auto-generated constructor stub
		super(loaixe,tgianvao,tgianra,tienthue);
		this.bienso = bienso;
	}
	public String getChiTiet() {
		String xe = "\nXeMaybean ["
						+ "bienso=" + bienso + ", "
						+ "loaixe=" + loaixe + ", "
						+ "tgianvao=" + tgianvao + ", "
						+ "tgianra=" + tgianra + ", "
						+ "tienthue=" + tienthue 
						+ "]" + "\n";
		return xe;
	}
	
}

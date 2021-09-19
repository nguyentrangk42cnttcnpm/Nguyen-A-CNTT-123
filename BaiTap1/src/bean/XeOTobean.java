package bean;

public class XeOTobean extends ChiTietbean {
	protected String bienso;
	protected String ttrangvao;
	protected String ttrangra;
	public XeOTobean(int loaixe, String bienso, String tgianvao, String tgianra, String ttrangvao, String ttrangra, float tienthue) {
		// TODO Auto-generated constructor stub
		super(loaixe,tgianvao,tgianra,tienthue);
		this.bienso = bienso;
		this.ttrangvao = ttrangvao;
		this.ttrangra = ttrangra;
	}
	public String getChiTiet() {
		String xe = "\nXeOTobean ["
						+ "bienso=" + bienso + ", "
						+ "loaixe=" + loaixe + ", "
						+ "tgianvao=" + tgianvao + ", "
						+ "tgianra=" + tgianra
						+ ", ttrangvao=" + ttrangvao + ", "
						+ "ttrangra=" + ttrangra + ", "
						+ "tienthue=" + tienthue 
						+ "]"+"\n";
		return xe;
	}
	
}

package enumeracion;

public enum Continentes {
	AMERICA(34),
	ASIA(44),
	EUROPA(46),
	OSEANIA(14),
	AFRICA(53);
	
	private final int paises;
	
	Continentes(int paises){
		this.paises = paises;
	}
	public int getPaises() {
		return this.paises;
	}
	

}

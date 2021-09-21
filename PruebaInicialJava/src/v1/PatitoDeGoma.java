package v1;

public class PatitoDeGoma extends Barco {
	private String moneria;
	public PatitoDeGoma(String altura, String ancho) {
		super(altura, ancho);
		this.moneria=moneria;
	}
	public String getMoneria() {
		return moneria;
	}

}

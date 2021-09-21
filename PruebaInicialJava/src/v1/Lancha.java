package v1;

public class Lancha  extends Barco{
	
	private int velocidadmax;
	private int potencia;
	
	public Lancha(String altura, String ancho, int capacidad, int codigo) {
		super(altura, ancho, capacidad, codigo);
		this.velocidadmax=velocidadmax;
		this.potencia=potencia;
		
	}

	public int getVelocidadmax() {
		return velocidadmax;
	}

	public int getPotencia() {
		return potencia;
	}
	
	

}

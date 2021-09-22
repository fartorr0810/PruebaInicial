package v1;

public class Lancha  extends Barco{
	
	private int velocidadmax;
	private int potencia;
	
	public Lancha(double altura, double ancho, int capacidad, String modelo) {
		super(altura, ancho, capacidad,modelo);
		this.velocidadmax=velocidadmax;
		this.potencia=potencia;
		
	}

	public int getVelocidadmax() {
		return velocidadmax;
	}

	public int getPotencia() {
		return potencia;
	}

	@Override
	public String toString() {
		return super.toString()+"La velocidad max de la lancha es: " 
	+ velocidadmax + "y  su potencia es de : " + potencia + "]";
	}
	
	

}

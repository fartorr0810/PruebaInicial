package v1;

public class Lancha  extends Barco implements ObtenerMPH{
	
	private int velocidadmax;
	private int potencia;
	public final double MPH=0.6214;
	public Lancha(double altura, double ancho, int capacidad, String modelo,int velocidadmax, int potencia) {
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

	@Override
	public double ObtenerMPH(int velocidadMax) {
		double mph=this.velocidadmax*MPH;
		return mph;
	}

	
	

}

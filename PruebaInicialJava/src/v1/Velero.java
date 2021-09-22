package v1;

public class Velero extends Barco{
	
	private int alturavela;

	public Velero(double altura, double ancho, int capacidad,int alturavela,String modelo) {
		super(altura, ancho, capacidad,modelo);
		this.alturavela=alturavela;
		
	}
	public int getAlturavela() {
		return alturavela;
	}
	@Override
	public String toString() {
		return super.toString()+"La altura de su vela es: " + alturavela + "]";
	}
	
	
}

package v1;

public class Velero extends Barco{
	
	private int alturavela;

	public Velero(String altura, String ancho, int capacidad, int codigo,int alturavela) {
		super(altura, ancho, capacidad, codigo);
		this.alturavela=alturavela;
		
	}
	public int getAlturavela() {
		return alturavela;
	}
	

}

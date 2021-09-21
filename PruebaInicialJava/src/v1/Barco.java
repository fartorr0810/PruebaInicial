package v1;

public abstract class Barco {
	private String altura;
	private String ancho;
	private int capacidad;
	private int codigo;
	private static int codigoAutomatico=0;
	
	public Barco(String altura, String ancho,int capacidad,int codigo) {
		this.altura = altura;
		this.ancho = ancho;
		this.capacidad=capacidad;
		this.codigo=codigoAutomatico;
		codigoAutomatico++;
	}
	
}

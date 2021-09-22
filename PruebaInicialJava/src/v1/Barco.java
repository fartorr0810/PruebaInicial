package v1;

import java.util.Objects;

public abstract class Barco {
	private double altura;
	private double ancho;
	private int capacidad;
	private int codigo;
	private String modelo;
	private static int codigoAutomatico=0;
	
	public Barco(double altura, double ancho,int capacidad,String modelo) {
		this.altura = altura;
		this.ancho = ancho;
		this.capacidad=capacidad;
		this.codigo=codigoAutomatico;
		this.modelo=modelo;
		codigoAutomatico++;
	}
	
	public double getAltura() {
		return altura;
	}

	public double getAncho() {
		return ancho;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getModelo() {
		return modelo;
	}

	//Un barco sera igual si tienen el mismo modelo y codigo.
	@Override
	public int hashCode() {
		return Objects.hash(codigo, modelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Barco other = (Barco) obj;
		return codigo == other.codigo && Objects.equals(modelo, other.modelo);
	}

	@Override
	public String toString() {
		return "Barco con altura: " + altura + "de  ancho :" + ancho + ", capacidad de: " + capacidad + "con "
				+ "codigo: " + codigo
				+ "y su modelo:"  + modelo+"";
		
	}
	
}

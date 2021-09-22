package v1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class Empresa {
	private LinkedList<Barco> listabarcos;

	public Empresa() {
		this.listabarcos = new LinkedList<Barco>();
	}
	public void addVelero(double altura, double ancho,int capacidad,String modelo,int alturavela) throws Exception {
		Velero v1=new Velero(altura, ancho, capacidad, alturavela, modelo);
		listabarcos.add(v1);
	}
	public void addLancha(double altura, double ancho,int capacidad,String modelo,int alturavela) throws Exception {
		Velero v1=new Velero(altura, ancho, capacidad, alturavela, modelo);
		listabarcos.add(v1);
	}
	public boolean delBarco(int codigo,String modelo) throws Exception {
		boolean result=false;
		boolean encontrado=false;
		Iterator<Barco> sig = listabarcos.iterator();
		while (sig.hasNext( ) && !encontrado) {
			Barco b1 = (Barco) sig.next();
			if (b1 instanceof Velero 
				&& b1.getCodigo()==codigo && b1.getModelo().equals(modelo)) {
				encontrado=true;
				listabarcos.remove(b1);
				result=true;
				}
			if (b1 instanceof Lancha 
					&& b1.getCodigo()==codigo && b1.getModelo().equals(modelo)) {
					encontrado=true;
					listabarcos.remove(b1);
					result=true;
					}
			}
		
		return result;	
	}
	public String mostrarListaBarcos() {
		StringBuilder sb=new StringBuilder();
		for (Barco barco : listabarcos) {
			sb.append(barco.toString()+"\n");
		}
		return sb.toString();
	}
}

package v1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;




public class Empresa {
	//He elegido LinkedList porque es mas facil de ordenar, eliminar e insertar datos por toda la lista.
	private LinkedList<Barco> listabarcos;

	public Empresa() {
		this.listabarcos = new LinkedList<Barco>();
	}
	//Metodo para anadir Barcos
	public void addVelero(double altura, double ancho,int capacidad,String modelo,int alturavela) throws Exception {
		Velero v1=new Velero(altura, ancho, capacidad, alturavela, modelo);
		listabarcos.add(v1);
	}
	public void addLancha(double altura, double ancho,int capacidad,String modelo,int velocidadmax,int potencia) throws Exception {
		Lancha v1=new Lancha(altura, ancho, capacidad, modelo,velocidadmax,potencia);
		listabarcos.add(v1);
	}
	//Eliminar barcos indicando el codigo y modelo
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
		//No importa lancha o velero
		
		return result;	
	}
	public String mostrarListaBarcos() {
		StringBuilder sb=new StringBuilder();
		for (Barco barco : listabarcos) {
			sb.append(barco.toString()+"\n");
		}
		return sb.toString();
	}
	public String OrdenarListaPorModelo() {
		String sb=new String();
		Collections.sort(listabarcos);
		for (Barco barco :listabarcos) {
			sb+=""+barco.toString()+"\n";
		}
		return sb.toString();
	}
	/*
	 * @param 
	 */
	public String OrdenarListaPorAlturaYModelo() {
		String sb=new String();
		Collections.sort(listabarcos,new OrdenarAlfabeticamenteYAltura());
		for (Barco barco :listabarcos) {
			sb+=""+barco.toString()+"\n";
		}
		return sb.toString();
	}
	public double obtenerMPHdeLancha(String modelo) throws Exception {
		boolean result=false;
		boolean encontrado=false;
		double mph=0;
		Iterator<Barco> sig = listabarcos.iterator();
		while (sig.hasNext( ) && !encontrado) {
			Barco b1 = (Barco) sig.next();
			if (b1 instanceof Velero) {
				throw new Exception("Es un velero y todo depende del viento");
				}			
			else if (b1 instanceof Lancha && 
					b1.getModelo().equals(modelo)) {
					encontrado=true;
					mph=((Lancha) b1).ObtenerMPH(((Lancha) b1).getVelocidadmax());
					}
			}
		
		return mph;	
	}
}

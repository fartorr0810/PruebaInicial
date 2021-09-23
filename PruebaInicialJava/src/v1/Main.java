package v1;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Empresa cabernet=new Empresa();
		//Anado barcos a la flota
		cabernet.addVelero(12.0,20.0, 6, "A-1", 7);
		cabernet.addLancha(16.0, 30, 4, "Z-4",120,250 );
		cabernet.addVelero(12.0,20.0, 6, "A-1", 7);
		
		//Elimino un barco por su codigo y modelo
		cabernet.addLancha(6.0, 2, 4, "Z-12",120,250 );
		System.out.println(cabernet.delBarco(3, "Z-12"));
		//Ordeno las listas por modelo y luego por Altura y alfabeticamente por su modelo
		System.out.println(cabernet.OrdenarListaPorModelo());//Comparable
		System.out.println(cabernet.OrdenarListaPorAlturaYModelo());//CompareTo
		//Pruebo toString
		System.out.println(cabernet.mostrarListaBarcos());
		
		//Ver Velocidades
		System.out.println(cabernet.obtenerMPHdeLancha("Z-4"));
		//System.out.println(cabernet.obtenerMPHdeLancha("A-1")); No es una lancha

	}

}

package v1;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Empresa cabernet=new Empresa();
		cabernet.addVelero(12.0,20.0, 6, "A-1", 7);
		cabernet.addVelero(12.0,20.0, 6, "A-1", 7);
		System.out.println(cabernet.delBarco(1, "A-1"));
		System.out.println(cabernet.mostrarListaBarcos());
	}

}

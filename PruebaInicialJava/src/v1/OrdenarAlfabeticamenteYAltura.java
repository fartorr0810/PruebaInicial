package v1;

import java.util.Comparator;

public class OrdenarAlfabeticamenteYAltura implements Comparator<Barco>{

	@Override
	public int compare(Barco o1, Barco o2) {
		int result;
		if (o1.getAltura()>o2.getAltura()) {
			result=-1;
		}
		else if (o1.getAltura()<o2.getAltura()) {
			result=1;
		}
		else {
			result=o1.getModelo().compareTo(o1.getModelo());
		}
		
		return result;
	}

}

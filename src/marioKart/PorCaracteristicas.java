package marioKart;

import java.util.Comparator;
import java.util.Iterator;

public class PorCaracteristicas implements Comparator<PilotoKart>{

	@Override
	public int compare(PilotoKart o1, PilotoKart o2) {
		int sum1=0;
		int sum2=0;
		for (int i = 0; i < o1.getCaracteristicas().length; i++) {
			sum1 += o1.getCaracteristicas()[i];
		}
		for (int i = 0; i < o2.getCaracteristicas().length; i++) {
			sum2 += o1.getCaracteristicas()[i];

		}
		
		// TODO Auto-generated method stub
		return sum1-sum2;
	}

}

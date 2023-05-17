package marioKart;

import java.util.Comparator;

public class PorVelocidad implements Comparator<PilotoKart> {

	@Override
	public int compare(PilotoKart o1, PilotoKart o2) {
		// TODO Auto-generated method stub
		return o1.getCaracteristicas()[PilotoKart.VELOCIDAD] - o2.getCaracteristicas()[PilotoKart.VELOCIDAD];
	}

}

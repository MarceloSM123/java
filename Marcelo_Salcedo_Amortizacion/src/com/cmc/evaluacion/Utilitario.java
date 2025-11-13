package com.cmc.evaluacion;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utilitario {

	public double redondear (double numero) {
		BigDecimal bd = new BigDecimal(numero);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}

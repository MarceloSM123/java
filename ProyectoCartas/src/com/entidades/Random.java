package com.entidades;

public class Random {
	public static int obtenerPosicion() {
        double numeroRandom=Math.random();
        return (int)(numeroRandom*51+1);
    }
}

package com.cmc.evaluacion;

//import com.cmc.evaluacion.entidades.Prestamo;
//import com.cmc.evaluacion.servicios.CalculadoraAmortizacion;

public class TestCuota {
    public static void main(String[] args) {
        Prestamo préstamo = new Prestamo(5000, 12, 12);
        CalculadoraAmortizacion a=new CalculadoraAmortizacion();
        double cuota=a.calcularCuota(préstamo);
        System.out.println("Cuota: " + cuota);
    }
}

package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// creo el objeto cuenta y lo referencio con cuenta1
		Cuenta cuenta1=new Cuenta("03476");
		//coloco un valor de saldo en la cuenta1
		cuenta1.setSaldo(675);
		// creo el objeto cuenta y lo referencio con cuenta2
		Cuenta cuenta2=new Cuenta("03476","C",98);
		//creo el objeto ceunta y ki referencio con cuenta 3
		Cuenta cuenta3=new Cuenta("03476");
		//modifico el tipo de cuenta
		cuenta3.setTipo("C");
		System.out.println("---------Valores Iniciales------");
		// imprimo cuenta 1
		cuenta1.Imprimir();
		//imprimir cuenta 2
		cuenta2.Imprimir();
		//imprimir cuenta 3
		cuenta3.Imprimir();
		
		System.out.println("--------Valores Modificados------");
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		
		//Impresion de cambios
		// imprimo cuenta 1
		cuenta1.Imprimir();
		//imprimir cuenta 2
		cuenta2.Imprimir();
		//imprimir cuenta 3
		cuenta3.Imprimir();
		
		//CREACION CUENTA 4 usando el constructor de 1 parametro
		
		Cuenta cuenta4=new Cuenta("0987");
		cuenta4.setTipo("A");
		cuenta4.setSaldo(10);
		
		//creacion cuenta 5 usando el constructo de 3 parametros
		Cuenta cuenta5=new Cuenta("0557","C",10);
		
		//Construccion de la cuenta6 utilizando cualquier constructor
		
		Cuenta cuenta6=new Cuenta("0666","A",0);
		
		//impresion de Cuenta 4, cuenta5 y cuanta 6
		
		// imprimo cuenta 4
				cuenta4.imprimirConMiEstilo();
				//imprimir cuenta 5
				cuenta5.imprimirConMiEstilo();
				//imprimir cuenta 6
				cuenta6.imprimirConMiEstilo();
		
	}

}

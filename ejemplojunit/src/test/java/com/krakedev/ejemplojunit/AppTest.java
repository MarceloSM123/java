package com.krakedev.ejemplojunit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
    @Test
    public void testSumar() {
    	Calculadora calculadora=new Calculadora();
    	int a=calculadora.suma(5, 10);
    	assertTrue(a==15);
    	//assertEquals(15.0, a, 0.0001);
    }
    
    @Test
    public void testRestar() {
    	Calculadora calculadora2=new Calculadora();
    	int b=calculadora2.resta(10, 5);
    	assertTrue(b==5);
    	//assertEquals(15.0, a, 0.0001);
    }
}
//}
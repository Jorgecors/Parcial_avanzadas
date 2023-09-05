package com.example.operaciones_2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testNu {

    @Test
    public void testMultiplicacion() {
        int resultado = pantalla_multiplicacion.multiplicacion(5, 3);
        assertEquals(15, resultado);
    }

    @Test
    public void testMultiplicacionConCero() {
        int resultado = pantalla_multiplicacion.multiplicacion(0, 7);
        assertEquals(21, resultado);
    }

    @Test
    public void testMultiplicacionNegativa() {
        int resultado = pantalla_multiplicacion.multiplicacion(-4, 45);
        assertEquals(-24, resultado);
    }
}
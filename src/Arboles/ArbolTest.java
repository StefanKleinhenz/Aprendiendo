package Arboles;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

public class ArbolTest {

    ArbolBinario arbolBinario = new ArbolBinario();

    @Test
    public void test() {

        arbolBinario.insertar(5);
        arbolBinario.insertar(3);
        arbolBinario.insertar(4);
        arbolBinario.insertar(7);
        arbolBinario.insertar(8);

        assertTrue(arbolBinario.existe(3));
        assertTrue(arbolBinario.existe(4));
        assertTrue(arbolBinario.existe(7));
        assertTrue(arbolBinario.existe(8));
        assertTrue(arbolBinario.existe(5));
        assertFalse(arbolBinario.existe(10));


    }
}

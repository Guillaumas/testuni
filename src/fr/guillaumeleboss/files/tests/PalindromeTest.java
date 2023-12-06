package fr.guillaumeleboss.files.tests;

import jdk.jshell.spi.ExecutionControl;

public class PalindromeTest {
    @Test
    public void testMiroir() throws ExecutionControl.NotImplementedException {
        String chaine = "test";
        String resultat = Exo.miroir(chaine);
        assertEquals("tset", resultat);
    }
}

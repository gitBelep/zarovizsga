package hu.nive.ujratervezes.zarovizsga;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeagleTest {

    @Test
    void feed() {
        Beagle b = new Beagle("Fido");
        assertEquals(0, b.getHappiness());
        assertEquals("Fido", b.getName());
        b.play(5);
        assertEquals(10, b.getHappiness());
        b.feed();
        assertEquals(12, b.getHappiness());
    }
}
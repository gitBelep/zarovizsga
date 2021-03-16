package hu.nive.ujratervezes.zarovizsga;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsCounterTest {

    @Test
    void getCountOfDigits() {
        DigitsCounter d = new DigitsCounter();
        assertEquals(5, d.getCountOfDigits("32132122163253212"));
    }
}
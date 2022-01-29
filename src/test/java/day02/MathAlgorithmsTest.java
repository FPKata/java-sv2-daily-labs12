package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {
    @Test
    void testFindLnko(){
        MathAlgorithms mathAlgorithms = new MathAlgorithms();

        assertEquals(6, mathAlgorithms.findLnko(12, 18));
        assertEquals(1, mathAlgorithms.findLnko(16, 7));

        assertEquals(6, mathAlgorithms.findLnkoWithWhile(18, 12));
        assertEquals(1, mathAlgorithms.findLnkoWithWhile(13, 5));
    }
}
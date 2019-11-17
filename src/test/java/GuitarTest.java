import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(50.00, 100.00,"Red", "Teak", "Strings", 5);
    }

    @Test
    public void canCheckBoughtPrice(){
        assertEquals(50.00, guitar.getBoughtPrice(), 0.01);
    }

    @Test
    public void canCheckSellPrice(){
        assertEquals(100.00, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canCheckColour(){
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void canCheckTeak(){
        assertEquals("Teak", guitar.getMaterial());
    }

    @Test
    public void canCheckType(){
        assertEquals("Strings", guitar.getType());
    }

    @Test
    public void canCheckNoOfStrings(){
        assertEquals(5, guitar.getNoOfStrings());
    }

    @Test
    public void canPlayNoise(){
        assertEquals("Playing: We Will Rock You", guitar.makeNoise("We Will Rock You"));
    }
}

import Accessories.GuitarPick;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarPickTest {

    GuitarPick guitarPick;

    @Before
    public void before(){
        guitarPick = new GuitarPick("blue", 2);
    }

    @Test
    public void canCHeckTheThickness(){
        assertEquals(2, guitarPick.getThickness());
    }

    @Test
    public void canCheckTheColour(){
        assertEquals("blue", guitarPick.getAccessoryColour());
    }

    @Test
    public void canCheckAccessoryType(){
        assertEquals("Guitar Accessory", guitarPick.getAccessoryType());
    }

    @Test
    public void canCheckBoughtPrice(){
        assertEquals(0.50, guitarPick.getBoughtPrice(), 0.01);
    }

    @Test
    public void canCheckSoldPrice(){
        assertEquals(1.00, guitarPick.getSellPrice(), 0.01);
    }
}

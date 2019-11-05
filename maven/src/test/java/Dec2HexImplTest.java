import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Dec2HexImplTest {
    @Test
    public void dec2HexTest(){
        ArrayList<String> values= new ArrayList<String>();
        values.add("15");
        values.add("31");

        Dec2HexImpl dec2Hex = new Dec2HexImpl();
        assertEquals("F", dec2Hex.decToHex(values));
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TradeTest {

    Trade t2 = new Trade("test1","ts",34);

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void setPrice() {
        double expected = 15.25;
        double actual = t2.getPrice();

        assertEquals(expected,actual);
    }
}
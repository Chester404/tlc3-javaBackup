import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StockTest {

    @Test
    public void userCanGetStockQuantity(){
        //mock the class
        Stock mockedStock = mock(Stock.class);

        //declare teh dummy result to return
        when(mockedStock.getQuantity()).thenReturn(5);

        assertEquals(5,mockedStock.getQuantity());
    }


    @org.junit.jupiter.api.Test
    public double setPrice() {
        Stock mockedSetPrice = mock(Stock.class);

        when(mockedSetPrice.setPrice(5.0)).thenReturn(5.0);
    }
}

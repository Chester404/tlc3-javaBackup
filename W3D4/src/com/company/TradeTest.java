package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TradeTest {

Trade t4 = new Trade("test","ts",456,34.6);

    @Test
    public void setPrice() {
        assertTrue(t4.setPrice(34.6) > 0);
    }
}
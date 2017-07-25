package com.sneh.Another;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnotherTest {

    public static final int A = 10;

    @Test
    public void storeReturns() {
        int addExact = A + 20;
        System.out.println(addExact);
        System.out.println();
        assertEquals("", 40, 40);
    }

}

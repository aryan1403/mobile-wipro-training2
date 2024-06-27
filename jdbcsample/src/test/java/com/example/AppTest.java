package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void addTest() {
        // App app = new App();
        int result = App.add(4, 5);

        assertEquals(9, result);
    }

    @Test
    public void evenTest() {
        boolean result = App.even(3);
        assertFalse(result);
        // assertEquals(false, result);
        assertNotEquals(true, result);
        assertNull(null);
    }
}

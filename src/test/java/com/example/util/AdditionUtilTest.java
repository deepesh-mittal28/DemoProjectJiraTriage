package com.example.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the AdditionUtil class.
 */
public class AdditionUtilTest {

    @Test
    public void testAdd() {
        assertEquals(5, AdditionUtil.add(2, 3));
    }
}
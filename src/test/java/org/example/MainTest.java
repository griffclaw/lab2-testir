package org.example;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void Years() {
        String a = "2022";
        InputStream in = new ByteArrayInputStream(a.getBytes());
        System.setIn(in);
        String c = Main.Years();
        assertEquals("365 дней", c);
    }
}
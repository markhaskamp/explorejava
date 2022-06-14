package com.markhaskamp.explorejava;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsTest {

    String s;
    @BeforeEach
    public void setUp() {
        s = "eddie would go";
    }

    @AfterEach
    public void tearDown() {
        s = null;
    }

    @Test
    public void getClass_getName_will_return_var_type_as_String() {
        Integer n = 42;
        var sc = new SomeClass();

        assertEquals("java.lang.Integer", n.getClass().getName());
        assertEquals("java.lang.String", s.getClass().getName());
        assertEquals("com.markhaskamp.explorejava.SomeClass", sc.getClass().getName());
    }

    @Test
    public void given_split__then_returns_array_of_strings() {
        String expected = "[Ljava.lang.String;";
        var sut = s.split(" ");
        assertEquals(expected, sut.getClass().getName());
    }
}

class SomeClass {
    int n;
}

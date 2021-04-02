package pl.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WhatDoYouKnowAboutObjectsTest {

    @Test

    void equalOperator() {
        int int1 = 1;
        int int2 = 1;

        Integer intObject1 = new Integer(1);
        Integer intObject2 = new Integer(1);

        assertTrue(int1 == int2);
        //assertTrue(intObject1, intObject2);

        assertEquals(1, 1);
        assertEquals(intObject1, intObject2);

    }

    @Test

    void copyObject() {
        Integer intObject1 = new Integer(1);
        Integer copyObject1 = intObject1;

        assertEquals(intObject1, copyObject1);
        assertTrue(intObject1 == copyObject1);
    }

    @Test
    void blabla() {
        Point point = new Point(1,1);
        Point point2 = new Point(1,1 );

        assertEquals(point, point2);
    }


}

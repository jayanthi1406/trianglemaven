package com.example.trianglemaven;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void testEquilateral() {
        assertEquals("Equilateral",
            Triangle.classify(5, 5, 5));
    }

    @Test
    void testIsosceles() {
        assertEquals("Isosceles",
            Triangle.classify(5, 5, 8));
    }

    @Test
    void testScalene() {
        assertEquals("Scalene",
            Triangle.classify(4, 5, 6));
    }

    @Test
    void testInvalidTriangle() {
        assertEquals("Invalid",
            Triangle.classify(1, 2, 5));
    }

    @Test
    void testZeroSide() {
        assertEquals("Invalid",
            Triangle.classify(0, 5, 5));
    }
}
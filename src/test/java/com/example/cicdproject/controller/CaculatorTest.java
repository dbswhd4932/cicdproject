package com.example.cicdproject.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaculatorTest {
    @Test
    void plus() {
        int result = Calculator.plus(1, 2);
        assertEquals(3, result);
    }
}
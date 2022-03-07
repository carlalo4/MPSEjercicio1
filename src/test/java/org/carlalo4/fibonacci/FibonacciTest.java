package org.carlalo4.fibonacci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test cases:
 * fibonacci 0 -> 0 *
 * fibonacci 1 -> 1 *
 * fibonacci 2 -> 1 *
 * fibonacci 3 -> 2 *
 * fibonacci 4 -> 3 *
 * fibonacci 15 -> 610 *
 * fibonacci negative number -> raises an exception
 */
public class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    public void setup() {
        fibonacci = new Fibonacci() ;
    }

    @AfterEach
    public void finish() {
        fibonacci = null ;
    }

    @Test
    public void returnZeroIfTheNumberIsZero(){
        int expectedValue = 0 ;
        int obtainedValue = fibonacci.compute(0) ;

        assertEquals(expectedValue, obtainedValue) ;
    }

    @Test
    public void returnOneIfTheNumberIsOne(){
        int expectedValue = 1 ;
        int obtainedValue = fibonacci.compute(1) ;

        assertEquals(expectedValue, obtainedValue) ;
    }

    @Test
    public void returnOneIfTheNumberIsTwo(){
        int expectedValue = 1 ;
        int obtainedValue = fibonacci.compute(2) ;

        assertEquals(expectedValue, obtainedValue) ;
    }


    @Test
    public void returnTwoIfTheNumberIsThree(){
        int expectedValue = 2 ;
        int obtainedValue = fibonacci.compute(3) ;

        assertEquals(expectedValue, obtainedValue) ;
    }

    @Test
    public void returnThreeIfTheNumberIsFour(){
        int expectedValue = 3 ;
        int obtainedValue = fibonacci.compute(4) ;

        assertEquals(expectedValue, obtainedValue) ;
    }

    @Test
    public void return610IfTheNumberIs15(){
        int expectedValue = 610 ;
        int obtainedValue = fibonacci.compute(15) ;

        assertEquals(expectedValue, obtainedValue) ;
    }
}

package it.baitz.butterfly;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MaNoFoK
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @org.junit.Test
    public void testAdd() {
        System.out.println("add");
        int a = 5;
        int b = 5;
        int expResult = 10;
        int result = Calculator.add(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of sub method, of class Calculator.
     */
    @org.junit.Test
    public void testSub() {
        System.out.println("sub");
        int a = 10;
        int b = 5;
        int expResult = 5;
        int result = Calculator.sub(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of mult method, of class Calculator.
     */
    @org.junit.Test
    public void testMult() {
        System.out.println("mult");
        int a = 3;
        int b = 3;
        int expResult = 9;
        int result = Calculator.mult(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of div method, of class Calculator.
     */
    @org.junit.Test
    public void testDiv() {
        System.out.println("div");
        int a = 20;
        int b = 4;
        int expResult = 5;
        int result = Calculator.div(a, b);
        assertEquals(expResult, result);
    }
    
}

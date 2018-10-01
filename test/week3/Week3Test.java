package week3;

//import static junit.framework.Assert.assertEquals;
//import static junit.framework.Assert.fail;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Week3Test {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of max method, of class Week3.
     */
    @Test
    public void testMax() {
        //System.out.println("max");
        int m = 6;
        int n = 2;
        int expResult = 6;
        int result = Week3.max(m, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMax2() {
        int m = 104412414;
        int n = 1452351334;
        int expResult = 1452351334;
        int result = Week3.max(m, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMax3() {
        int m = -95;
        int n = -273;
        int expResult = -95;
        int result = Week3.max(m, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMax4() {
        int m = 1024;
        int n = 2048;
        int expResult = 2048;
        int result = Week3.max(m, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMax5() {
        int m = -100;
        int n = 32;
        int expResult = 32;
        int result = Week3.max(m, n);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of minOfArray method, of class Week3.
     */
    
    @Test
    public void testMinOfArray() {
        //System.out.println("minOfArray");
        int[] array = {1, 6, 7, 9, 10, 204};
        int expResult = 1;
        int result = Week3.minOfArray(array);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMinOfArray2() {
        //System.out.println("minOfArray");
        int[] array = {-42, 13, 53, -103};
        int expResult = -103;
        int result = Week3.minOfArray(array);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMinOfArray3() {
        //System.out.println("minOfArray");
        int[] array = {192, 953, 362};
        int expResult = 192;
        int result = Week3.minOfArray(array);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMinOfArray4() {
        //System.out.println("minOfArray");
        int[] array = {100, 352, 48, 110};
        int expResult = 48;
        int result = Week3.minOfArray(array);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMinOfArray5() {
        //System.out.println("minOfArray");
        int[] array = {3, 8, 96, 53, 3, 2};
        int expResult = 2;
        int result = Week3.minOfArray(array);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of calculateBMI method, of class Week3.
     */
    @Test
    public void testCalculateBMI() {
        //System.out.println("calculateBMI");
        double weight = 70.0;
        double height = 1.8;
        String expResult = "Binh thuong";
        String result = Week3.calculateBMI(weight, height);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalculateBMI2() {
        double weight = 61.0;
        double height = 1.5;
        String expResult = "Beo phi";
        String result = Week3.calculateBMI(weight, height);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateBMI3() {
        double weight = 46.0;
        double height = 1.6;
        String expResult = "Thieu can";
        String result = Week3.calculateBMI(weight, height);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateBMI4() {
        double weight = 49.0;
        double height = 1.5;
        String expResult = "Binh thuong";
        String result = Week3.calculateBMI(weight, height);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateBMI5() {
        double weight = 80.0;
        double height = 1.8;
        String expResult = "Thua can";
        String result = Week3.calculateBMI(weight, height);
        assertEquals(expResult, result);
    }
    
}

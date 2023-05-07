package com.automation.testcases;
// 1. a = 10, b = 5, expected = 2
// 2. a = 4, b =0, expected = exception
// 3. a = 10, b = 10, expected = 1
// 4. a = -10, b = 5, expected = -2
// 5. a = -10, b = -5, expected = 2, *** <- this test we will
// 6. a = 10, b = 20, expected = 0
// 7. a = 0, b = 10, expected = 0
// 8. a = 0, b = 0, expected = exception
// 9. a - 10000, b = 2500, expected = 4
// 10. a = 10, b = -5, expected = -2


import com.dev.product.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MulTest {
    Calculator cal;
    @Before
    public void setUp(){
        cal = new Calculator();
    }

    @Test
    public void testOne(){
       int  a = 10, b = 5, expected = 50;
       int actual = cal.mul(a, b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTwo(){
        int  a = 4, b = 0, expected = 0;
        int actual = cal.mul(a, b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testThree(){
        int a = 10, b = 10, expected = 100;
        int actual = cal.mul(a, b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFour(){
        int a = -10, b = 5, expected = -50;
        int actual = cal.mul(a, b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testFive(){
        int a = -10, b = -5, expected = 50;
        int actual = cal.mul(a, b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSix(){
        int a = 10, b = 20, expected = 200;
        int actual = cal.mul(a, b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSeven(){
        int a = 0, b = 10, expected = 0;
        int actual = cal.mul(a, b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testEight(){
        int a = 0, b = 0, expected = 0;
        int actual = cal.mul(a, b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testNine(){
        int  a = 1, b = 25, expected = 25;
        int actual = cal.mul(a, b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTen(){
        int a = 10, b = -5, expected = -50;
        int actual = cal.mul(a, b);
        Assert.assertEquals(expected, actual);
    }


}

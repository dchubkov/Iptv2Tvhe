package com.dchubkov.iptv2tvhe;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

/**
 * Unit test for iptv2tvhe app.
 */
public class Iptv2TvheTest {
    
    int testInt;

    @BeforeMethod
    public void setUp() {
        testInt = 0;
    }

    @Test (groups = { "Smoke", "Unit" }, description = "Some smoke test", priority = 1)
    public void smokeTest() {
        testInt++;
        Assert.assertTrue(testInt == 1);
        System.out.println("smoke test passed");
    }
    
    @Test (groups = { "Unit" }, description = "Some test", priority = 2)
    public void someTest() {
        testInt++;
        Assert.assertTrue(testInt == 2);
        System.out.println("some test passed");
    }
}
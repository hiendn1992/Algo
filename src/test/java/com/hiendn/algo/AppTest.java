package com.hiendn.algo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void findCommonElement_NullParams_EmptyOutput()
    {
        assertEquals(Arrays.asList(), App.findCommonElement(null, null));
    }
    
    @Test
    public void findCommonElement_EmptyParams_EmptyOutput()
    {
    	int[] a = {};
        int[] b = {};
        assertEquals(Arrays.asList(), App.findCommonElement(a, b));
    }
    
    @Test
    public void findCommonElement_HasCommonElement_ValidOutput()
    {
    	int[] a = {1, 2, 5, 5, 8, 9, 7, 7, 10, 11};
        int[] b = {1, 0, 6, 15, 6, 4, 7, 0};
        assertEquals(Arrays.asList(1, 7), App.findCommonElement(a, b));
    }
    
    @Test
    public void findCommonElement_NoCommonElement_EmptyOutput()
    {
    	int[] a = {3, 2, 5, 5, 8, 8, 9, 10};
        int[] b = {1, 0, 6, 15, 6, 4, 0, 22};
        assertEquals(Arrays.asList(), App.findCommonElement(a, b));
    }
    
}

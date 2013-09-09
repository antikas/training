/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jclarity.advjava.ex6;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jclarity.advjava.ex3.Otter;
import com.jclarity.advjava.ex3.SortingOtters;

/**
 *
 * @author boxcat
 */
public class OtterTest {
    
    @Test
    public void testOtter() {
        // Look at the Otter class from Exercise 2.
        // How can you reflexively construct instances of Otter to test 
        // the getter methods?
    }
    
    @Test
    public void testOtterSorter()
    {
    	Otter[] otters = new SortingOtters().sortOtters();
    	assertTrue(otters.length > 1); // if only one otter we cannot sort or compare
    	for (int i = 1; i < otters.length; i++)
    	{
	    	Otter o1 = otters[i-1];
	    	Otter o2 = otters[i];
	    	assertTrue(o2.getName().compareTo(o1.getName()) >= o1.getName().compareTo(o2.getName()) 
	    			|| o2.getTailLength() >= o1.getTailLength());
    	}
    }
    
}

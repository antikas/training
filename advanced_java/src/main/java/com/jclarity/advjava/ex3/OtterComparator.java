package com.jclarity.advjava.ex3;

import java.util.Comparator;

/**
 * Flesh out this class so that Otters can be compared correctly
 * 
 * Otters should be sorted by name and then tail length from shortest 
 * to longest
 */
public class OtterComparator implements Comparator<Otter> {

    @Override
    public int compare(Otter o1, Otter o2) {
        //a bit upside down 
    	if (o1.getName().equals(o2.getName())) //compare tails
    	{
    		return o1.getTailLength() - o2.getTailLength();
    	}
    	else // compare names 
    	{
    		return o1.getName().compareTo(o2.getName());
    	}
    }   
    
    
}

package com.jclarity.advjava.ex3;

import java.util.Arrays;

/**
 * Implement sortOtters
 */
public class SortingOtters {
    
    private Otter[] otters = new Otter[6];
    
    public SortingOtters() {
        otters[0] = new Otter("Ben", 10);
        otters[1] = new Otter("Ben", 8);
        otters[2] = new Otter("Martijn", 10);
        otters[3] = new Otter("Martijn", 5);
        otters[4] = new Otter("George", 5);
        otters[5] = new Otter("George", 9);
    }
    
    
    public Otter[] sortOtters() {
       Arrays.sort(getOtters(), new OtterComparator());
       return getOtters();
    }

    /**
     * @return the otters
     */
    public Otter[] getOtters() {
        return otters;
    }

}

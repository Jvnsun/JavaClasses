package com.Jvnsun.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class DefaultValuesModelTest {
    private static final int RAND_MAX = 100;
    private static Model model;
    private static boolean gotLowerBound;
    private static boolean gotUpperBound;
    
    @BeforeAll
    static void setUp() {
    	model = new Model(RAND_MAX);
    	gotLowerBound = false;
    	gotUpperBound = false;
    }
    
    @RepeatedTest(5101)
    void defaultRandTest(RepetitionInfo repetitionInfo) {
        assumeTrue(bothBoundsWereGenerated() == false);
    	int rand = model.rand();
        if (rand == 0) {
        	gotLowerBound = true;
        }
        if (rand == RAND_MAX) {
        	gotUpperBound = true;
        }
    }
        
    private boolean bothBoundsWereGenerated() {
    	return ( gotLowerBound && gotUpperBound );
    }
}
package com.Jvnsun.model;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {
    private Model model = new Model();
    private Random random = new Random();

    @RepeatedTest(10)
    void defaultRandTest() {
        int rand = model.rand();
        checkBounds(0, model.RAND_MAX, rand);
    }

    @RepeatedTest(10)
    void boundedRandTest() {
        int lowerBound = random.nextInt(1000);
        int upperBound = lowerBound + 1 + random.nextInt(1000);
        int rand = model.rand(lowerBound, upperBound);
        checkBounds(lowerBound, upperBound, rand);
    }

    private void checkBounds(int lower, int upper, int value) {
        assertTrue(value >= lower);
        assertTrue(value <= upper);
    }



}
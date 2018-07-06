package com.Jvnsun.model;

import java.util.Random;

public class Model {
    public final int RAND_MAX;
    public int magickNum;
    public int lower;
    public int upper;

    public Model() {
        this(100);
    }

    public Model(int rand_max) {
        this.RAND_MAX = rand_max;
        this.lower = 0;
        this.upper = RAND_MAX;
        this.magickNum = this.rand();
    }

    public int rand() {
        return rand(0, RAND_MAX);
    }

    public int rand(int min, int max) {
        Random random = new Random();
        int exclusiveRandRange = max - min + 1;
        return min + random.nextInt(exclusiveRandRange);
    }

    public void applyTurn(int turn) {
        if (magickNum > turn) {
            lower = turn;
        }
        else {
            upper = turn;
        }
    }
}

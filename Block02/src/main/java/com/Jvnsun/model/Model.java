package com.Jvnsun.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {
    public int RAND_MAX;
    public int number;
    public int exclusiveLowerBound;
    public int exclusiveUpperBound;
    public List history;

    public Model(int rm) {
        this.history = new ArrayList();
        this.RAND_MAX = rm;
    }

    public int rand() {
        return rand(0, RAND_MAX);
    }

    public int rand(int inclusiveLowerBound, int inclusiveUpperBound) {
        Random random = new Random();
        int exclusiveRandRange = inclusiveUpperBound - inclusiveLowerBound + 1;
        return inclusiveLowerBound + random.nextInt(exclusiveRandRange);
    }

    public void applyTurn(int turn) {
        if (number > turn) {
            exclusiveLowerBound = turn;
        }
        else {
            exclusiveUpperBound = turn;
        }
    }

    public void appendHistory(Object o) {
        this.history.add(o);
    }
}

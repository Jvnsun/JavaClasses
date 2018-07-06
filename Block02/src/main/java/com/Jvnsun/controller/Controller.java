package com.Jvnsun.controller;

import com.Jvnsun.View.View;
import com.Jvnsun.model.Model;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model m, View v) {
        this.model = m;
        this.view = v;
    }

    public void processUser() {
        boolean won = false;
        while (!won) {
            won = makeTurn();
        }
    }

    private boolean makeTurn() {
        view.requestNumber(model.lower, model.upper);
        String input = view.readInput();
        try {
            int inputNum = Integer.valueOf(input);
            if (!isInBounds(model.lower, model.upper, inputNum)) {
                view.displayBoundsError();
                return makeTurn();
            }
            if (inputNum == model.magickNum) {
                view.displayGreeting();
                return true;
            }
            model.applyTurn(inputNum);
            return makeTurn();
        }
        catch (NumberFormatException e) {
            view.displayNANError();
            return makeTurn();
        }
    }

    private boolean isInBounds(int lower, int upper, int value) {
        return ((lower <= value) && (value <= upper));
    }

}

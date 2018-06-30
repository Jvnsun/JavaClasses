package com.Jvnsun;

import com.Jvnsun.View.View;

import java.util.Scanner;

public class Controller {

    public Controller(Model m, View v) {
        this.model = m;
        this.view = v;
        this.sc = new Scanner(System.in);
    }

    public void processUser() {
        String str1 = readInputSequence(view.SEQUENCE1);
        model.setFirstString(str1);
        String str2 = readInputSequence(view.SEQUENCE2);
        model.setSecondString(str2);
        view.displayMessage(model.getStringsCombination());
    }

    /**
     * Read input from user until it is not equal sequence
     * @param sequence to read
     * @return sequence read from user
     */
    private String readInputSequence(String sequence) {
        view.requestCharSequence(sequence);
        while (!sc.hasNext(sequence)) {
            view.displayMessage(view.WRONG_INPUT_SEQUENCE_MESSAGE);
            sc.next();
        }
        return sc.next();
    }

    private Model model;
    private View view;
    private Scanner sc;
}

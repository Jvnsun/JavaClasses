package com.Jvnsun.View;

import java.util.Scanner;

public class View {
    private static final String INPUT_REQUEST = "Please enter the number between ";
    private static final String DELIMITER = " ";
    private static final String NAN_ERROR = "Input is not an integer!";
    private static final String BOUNDS_ERROR = "Input is outside the bounds!";
    private static final String GREETING = "YAY! You're right";
    private Scanner scanner = new Scanner(System.in);

    public void requestNumber(int lower, int upper) {
        this.display(INPUT_REQUEST + lower + DELIMITER + upper + DELIMITER);
    }

    public void displayNANError() {
        this.display(NAN_ERROR);
    }

    public void displayBoundsError() {
        this.display(BOUNDS_ERROR);
    }

    public void displayGreeting() {
        this.display(GREETING);
    }

    public String readInput() {
        return this.scanner.next();
    }

    private void display(String str) {
        System.out.println(str);
    }
}

package com.Jvnsun.View;

public interface View {

    String SEQUENCE_REQUEST_MESSAGE = "Please enter the sequence: ";
    String SEQUENCE1 = "Hello";
    String SEQUENCE2 = "world!";
    String WRONG_INPUT_SEQUENCE_MESSAGE = "Wrong input! Try again:";

    void displayMessage(String message);
    void requestCharSequence(String sequence);
}

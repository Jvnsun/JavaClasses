package com.Jvnsun.View;

public class ConsoleView implements View {


    @Override
    public void displayMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void requestCharSequence(String sequence) {
        displayMessage(this.SEQUENCE_REQUEST_MESSAGE + sequence);
    }
}

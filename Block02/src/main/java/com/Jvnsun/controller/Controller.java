package com.Jvnsun.controller;

import com.Jvnsun.View.View;
import com.Jvnsun.model.Model;
import com.Jvnsun.model.history.HistoryRecordFactory;

import java.util.Properties;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private Scanner scanner;

    public Controller(Model m, View v) {
        this.model = m;
        this.view = v;
        this.scanner = new Scanner(System.in);
    }

    public void applyConfig(Properties properties) {
        this.model.RAND_MAX = Integer.parseInt(properties.getProperty("RAND_MAX"));
        this.model.exclusiveLowerBound = Integer.parseInt(
                properties.getProperty("lowerExclusiveBound"));
        this.model.exclusiveUpperBound = Integer.parseInt(
                properties.getProperty("upperExclusiveBound"));
    }

    public void applyLocale(Properties properties) {
        this.view.setNumberRequest(properties.getProperty("numberRequest"));
        this.view.setNanError(properties.getProperty("nanError"));
        this.view.setBoundsError(properties.getProperty("boundsError"));
        this.view.setVictoryGreeting(properties.getProperty("victoryGreeting"));
        this.view.setHistoryHeader(properties.getProperty("historyHeader"));
        this.view.setHistoryRecord(properties.getProperty("historyRecord"));
        this.view.setHistoryNanErrorRecord(properties.getProperty(
                "historyNanErrorRecord"
        ));
        this.view.setHistoryBoundsErrorRecord(properties.getProperty(
                "historyBoundsErrorRecord"
        ));
        this.view.setHistoryWinRecord(properties.getProperty(
                "historyWinRecord"
        ));
    }

    public void processUser() {
        setRandomNumber();
        play();
    }

    private void setRandomNumber() {
        int inclusiveLowerBound = model.exclusiveLowerBound+1;
        int inclusiveUpperBound = model.exclusiveUpperBound-1;
        model.number = model.rand(inclusiveLowerBound, inclusiveUpperBound);
    }

    private void play() {
        int userNumber = getNumberFromUser();
        if (isInBounds(model.exclusiveLowerBound, model.exclusiveUpperBound, userNumber)) {
            model.applyTurn(userNumber);
            if (userNumber == model.number) {
                model.appendHistory(HistoryRecordFactory.getWinRecord(userNumber));
                view.displayVictoryGreeting();
                view.displayHistory(model.history);
                return;
            }
            model.appendHistory(HistoryRecordFactory.getCorrectTurnRecord(
                    userNumber, model.exclusiveLowerBound, model.exclusiveUpperBound
            ));
        }
        else {
            view.displayBoundsError();
            model.appendHistory(HistoryRecordFactory.getBoundsErrorRecord(
                    userNumber, model.exclusiveLowerBound, model.exclusiveUpperBound));
        }
        play();
    }

    private int getNumberFromUser() {
        view.requestNumber(model.exclusiveLowerBound, model.exclusiveUpperBound);
        while (!scanner.hasNextInt()) {
            view.displayNANError();
            model.appendHistory(HistoryRecordFactory.getNanErrorRecord(scanner.next()));
            view.requestNumber(model.exclusiveLowerBound, model.exclusiveUpperBound);
        }
        return this.scanner.nextInt();
    }

    private boolean isInBounds(int lower, int upper, int value) {
        return ((lower <= value) && (value <= upper));
    }

}

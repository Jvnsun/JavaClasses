package com.Jvnsun.View;

import com.Jvnsun.model.history.BoundsErrorHistoryRecord;
import com.Jvnsun.model.history.CorrectTurnHistoryRecord;
import com.Jvnsun.model.history.NanErrorHistoryRecord;
import com.Jvnsun.model.history.WinHistoryRecord;

import java.util.List;

public class View {
    private String numberRequest;
    private String nanError;
    private String boundsError;
    private String victoryGreeting;
    private String historyHeader;
    private String historyCorrectTurnRecord;
    private String historyNanErrorRecord;
    private String historyBoundsErrorRecord;
    private String historyWinRecord;

    public void requestNumber(int lower, int upper) {
        System.out.printf(numberRequest, lower, upper);
    }

    public void displayNANError() {
        System.out.println(nanError);
    }

    public void displayBoundsError() {
        System.out.println(boundsError);
    }

    public void displayVictoryGreeting() {
        System.out.println(victoryGreeting);
    }

    public void displayHistory(List history) {
        System.out.println(historyHeader);
        for (int i = 0; i < history.size(); i++) {
            Object record = history.get(i);
            System.out.print(i+1+". ");
            if (record instanceof CorrectTurnHistoryRecord) {
                displayCorrectTurnRecord(record);
            }
            else if (record instanceof NanErrorHistoryRecord) {
                displayNanErrorRecord(record);
            }
            else if (record instanceof BoundsErrorHistoryRecord){
                displayBoundsErrorRecord(record);
            }
            else {
                displayWinRecord(record);
            }
        }
    }

    private void displayCorrectTurnRecord(Object o) {
        CorrectTurnHistoryRecord record = (CorrectTurnHistoryRecord) o;
        System.out.printf(historyCorrectTurnRecord,
                record.input, record.exclusiveLowerBound, record.exclusiveUpperBound);
    }

    private void displayNanErrorRecord(Object o) {
        NanErrorHistoryRecord record = (NanErrorHistoryRecord) o;
        System.out.printf(historyNanErrorRecord, record.input);
    }

    private void displayBoundsErrorRecord(Object o) {
        BoundsErrorHistoryRecord record = (BoundsErrorHistoryRecord) o;
        System.out.printf(historyBoundsErrorRecord,
                record.input, record.exclusiveLowerBound, record.exclusiveUpperBound);
    }

    private void displayWinRecord(Object o) {
        WinHistoryRecord record = (WinHistoryRecord) o;
        System.out.printf(historyWinRecord, record.input);
    }

    public void setNumberRequest(String numberRequest) {
        this.numberRequest = numberRequest;
    }

    public void setNanError(String nanError) {
        this.nanError = nanError;
    }

    public void setBoundsError(String boundsError) {
        this.boundsError = boundsError;
    }

    public void setVictoryGreeting(String victoryGreeting) {
        this.victoryGreeting = victoryGreeting;
    }

    public void setHistoryHeader(String historyHeader) {
        this.historyHeader = historyHeader;
    }

    public void setHistoryRecord(String historyRecord) {
        this.historyCorrectTurnRecord = historyRecord;
    }

    public void setHistoryNanErrorRecord(String historyNanErrorRecord) {
        this.historyNanErrorRecord = historyNanErrorRecord;
    }

    public void setHistoryBoundsErrorRecord(String historyBoundsErrorRecord) {
        this.historyBoundsErrorRecord = historyBoundsErrorRecord;
    }

    public void setHistoryWinRecord(String historyWinRecord) {
        this.historyWinRecord = historyWinRecord;
    }
}

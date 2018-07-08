package com.Jvnsun.model.history;

public class HistoryRecordFactory {
    public static CorrectTurnHistoryRecord getCorrectTurnRecord(
            int input, int lower, int upper) {
        CorrectTurnHistoryRecord cthr = new CorrectTurnHistoryRecord();
        cthr.input = input;
        cthr.exclusiveLowerBound = lower;
        cthr.exclusiveUpperBound = upper;
        return cthr;
    }

    public static NanErrorHistoryRecord getNanErrorRecord(String input) {
        NanErrorHistoryRecord nehr = new NanErrorHistoryRecord();
        nehr.input = input;
        return nehr;
    }

    public static BoundsErrorHistoryRecord getBoundsErrorRecord(
            int input, int lower, int upper) {
        BoundsErrorHistoryRecord behr = new BoundsErrorHistoryRecord();
        behr.input = input;
        behr.exclusiveLowerBound = lower;
        behr.exclusiveUpperBound = upper;
        return behr;
    }

    public static WinHistoryRecord getWinRecord(int input) {
        WinHistoryRecord whr = new WinHistoryRecord();
        whr.input = input;
        return  whr;
    }
}

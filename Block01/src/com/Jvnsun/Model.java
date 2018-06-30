package com.Jvnsun;

public class Model {

    public void setFirstString(String s) {
        this.firstString = s;
    }

    public void setSecondString(String s) {
        this.secondString = s;
    }

    public String getStringsCombination() {
        return ( this.firstString + " " + this.secondString );
    }

    private String firstString;
    private String secondString;

}

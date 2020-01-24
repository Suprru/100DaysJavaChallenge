package com.company;

import com.company.Telephone;

public class DeskPhone implements Telephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken ");
    }

    @Override
    public void dail(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on desktop");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the deskphone ");
            isRinging=true  ;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber==myNumber) {
            isRinging=true;
            System.out.println("Ring ring ");
        } else {
            isRinging=false;
        }
        return isRinging;

    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

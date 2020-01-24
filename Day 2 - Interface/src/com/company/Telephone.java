package com.company;

public interface Telephone {
    void powerOn();
    void dail(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Telephone myPhone;
        myPhone = new DeskPhone(63375814);
        myPhone.powerOn();
        myPhone.callPhone(23821299);
        myPhone.isRinging();
        myPhone.answer();

        myPhone = new MobilePhone(50427918);
        myPhone.callPhone(58692245);


    }
}

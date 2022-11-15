package FactoryMethod_Member;

import Observer_Notify.Observer;

import java.util.Date;

public abstract class User extends Observer {
    String name;


    public void signup(String name) {

    }

    @Override
    public void receive(String msg, Date date, String place, String univName) {
        System.out.println(name+" 에서 알람을 받았습니다.");
        super.receive(msg, date, place, univName);
    }
}
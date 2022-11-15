package FactoryMethod_Member;

import Observer_Notify.Observer;

import java.util.Calendar;
import java.util.Date;

public abstract class User extends Observer {
    String name;
    int Level;//범위는 1~10
    public void signup(String name, int level) {
        this.name = name;
        this.Level = level;
    }

    public String getName() {
        return name;
    }

    @Override
    public void receive(String msg, Calendar date, String place, String univName) {
        System.out.println(name+" 에서 알람을 받았습니다.");
        super.receive(msg, date, place, univName);
    }
}
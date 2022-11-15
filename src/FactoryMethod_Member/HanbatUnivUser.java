package FactoryMethod_Member;

public class HanbatUnivUser extends User {


    @Override
    public void signup(String name) {
        System.out.println("한밭대생"+name +" 로그인");
        super.name = name;
    }
}


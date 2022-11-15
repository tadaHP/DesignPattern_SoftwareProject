package FactoryMethod_Member;

public class HanbatUnivUser implements User{

    String name;

    @Override
    public void signup(String name) {
        System.out.println("한밭대생"+name +" 로그인");
        this.name = name;
    }
}


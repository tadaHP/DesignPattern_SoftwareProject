package FactoryMethod_Member;

public class ChungnamUnivUser extends User {


    @Override
    public void signup(String name) {
        System.out.println("충남대생" + name + "로그인");
        super.name = name;
    }
}

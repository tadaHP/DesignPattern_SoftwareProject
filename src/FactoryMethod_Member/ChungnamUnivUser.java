package FactoryMethod_Member;

public class ChungnamUnivUser implements User {

    String name;

    @Override
    public void signup(String name) {
        System.out.println("충남대생" + name + "로그인");
        this.name = name;
    }
}

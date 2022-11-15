package FactoryMethod_Member;

public class HannamUnivUser implements User{

    String name;

    @Override
    public void signup(String name) {
        System.out.println("한남대생" + name + "로그인");
        this.name = name;
    }
}

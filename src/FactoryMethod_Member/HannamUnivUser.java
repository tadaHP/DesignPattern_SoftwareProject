package FactoryMethod_Member;

public class HannamUnivUser extends User {

    
    @Override
    public void signup(String name) {
        System.out.println("한남대생" + name + "로그인");
        super.name = name;
    }
}

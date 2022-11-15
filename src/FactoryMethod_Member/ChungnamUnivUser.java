package FactoryMethod_Member;

public class ChungnamUnivUser implements User {

    @Override
    public void signup() {
        System.out.println("충남대생 로그인");
    }
}

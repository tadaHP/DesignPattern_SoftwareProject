package FactoryMethod_Member;

public class HannamUnivUser implements User{

    @Override
    public void signup() {
        System.out.println("한남대생 로그인");
    }
}

package FactoryMethod_Member.UserFactory;

import FactoryMethod_Member.ChungnamUnivUser;
import FactoryMethod_Member.HanbatUnivUser;
import FactoryMethod_Member.User;

public class HanbatUserFactory extends UserFactory {
    @Override
    protected User createUser() {
        return new HanbatUnivUser();
    }
}


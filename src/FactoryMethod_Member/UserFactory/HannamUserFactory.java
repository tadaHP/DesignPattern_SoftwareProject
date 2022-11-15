package FactoryMethod_Member.UserFactory;

import FactoryMethod_Member.HannamUnivUser;
import FactoryMethod_Member.User;

public class HannamUserFactory extends UserFactory {
    @Override
    protected User createUser() {
        return new HannamUnivUser();
    }
}

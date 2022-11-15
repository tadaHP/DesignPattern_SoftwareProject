package FactoryMethod_Member.UserFactory;

import FactoryMethod_Member.HannamUnivUser;
import FactoryMethod_Member.User;

public class HannamUnivFactory extends UserFactory {
    @Override
    protected User createUser() {
        return new HannamUnivUser();
    }
}

package FactoryMethod_Member.UserFactory;

import FactoryMethod_Member.User;

public abstract class UserFactory {
    public User newInstance() {
        User user = createUser();
        user.signup();
        return user;
    }

    protected abstract User createUser();
}

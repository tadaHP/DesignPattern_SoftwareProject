package FactoryMethod_Member.UserFactory;

import FactoryMethod_Member.User;

public abstract class UserFactory {

    public User newInstance(String name) {
        User user = createUser();
        user.signup(name);
        return user;
    }

    protected abstract User createUser();
}

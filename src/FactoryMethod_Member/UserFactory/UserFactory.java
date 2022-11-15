package FactoryMethod_Member.UserFactory;

import FactoryMethod_Member.User;

public abstract class UserFactory{

    public User newInstance(String name, int level) {
        User user = createUser();
        user.signup(name, level);
        return user;
    }

    protected abstract User createUser();
}

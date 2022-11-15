import FactoryMethod_Member.*;
import FactoryMethod_Member.UserFactory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        UserFactory hanbat = new HanbatUserFactory();
        UserFactory chungnam = new ChungnamUserFactory();
        UserFactory hannam = new HanbatUserFactory();

//        User newHanbat = hanbat.newInstance();
//        User newChungnam = chungnam.newInstance();
//        User newHannam = hannam.newInstance();

//        newHanbat.signup();
//        newChungnam.signup();
//        newHannam.signup();

    }
}
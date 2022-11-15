import Builder_GameList.Game;
import FactoryMethod_Member.*;
import FactoryMethod_Member.UserFactory.*;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        UserFactory hanbat = new HanbatUserFactory();
//        UserFactory chungnam = new ChungnamUserFactory();
        UserFactory hannam = new HannamUserFactory();
///////////////////////////// TODO: 회원가입 커스텀 필요
//        User newHanbat = hanbat.newInstance();
//        User newChungnam = chungnam.newInstance();
        User newHannam = hannam.newInstance("Hannam1");

////////////////////////////////////


        //////////////////Builder TODO: 리스트로 만들어서 관리 필요

        Game game1 = Game.builder()
                .gameName("Test")
                .gameDate(new Date())
                .place("코트장")
                .description("TestDesc")
                .clubName("Null")
                .courtType("Grass")
                .build();

        Game game2 = Game.builder()
                .gameName("Test")
                .gameDate(new Date())
                .place("코트장")
                        .build();

        System.out.println(game1.toString());
        System.out.println(game2.toString());


        //////////////////




    }
}
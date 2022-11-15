import BuilderandStrategy_GameList.Game;
import BuilderandStrategy_GameList.Hanul_Run;
import BuilderandStrategy_GameList.KDK_Run;
import BuilderandStrategy_GameList.RunGame;
import FactoryMethod_Member.*;
import FactoryMethod_Member.UserFactory.*;
import Observer_Notify.ChungnamNotify;
import Observer_Notify.HanbatNotify;
import Observer_Notify.HannamNotify;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        UserFactory hanbat = new HanbatUserFactory();
        UserFactory chungnam = new ChungnamUserFactory();
        UserFactory hannam = new HannamUserFactory();
/////////////////////////////
        User hanbatUser1 = hanbat.newInstance("hanbat1",1);
        User hanbatUser2 = hanbat.newInstance("hanbat2",6);


        User chungnamUser1 = chungnam.newInstance("chungnam1",1);
        User chungnamUser2 = chungnam.newInstance("chungnam2",8);

        User hannamUser1 = hannam.newInstance("Hannam1",2);
        User hannamUser2 = hannam.newInstance("Hannam2",4);

////////////////////////////////////
        System.out.println();
        System.out.println();
        /////////Observer Pattern

        ChungnamNotify chungnamNotify = new ChungnamNotify();

        HanbatNotify hanbatNotify = new HanbatNotify();

        HannamNotify hannamNotify = new HannamNotify();

        //한밭대생 Noti등록
        hanbatNotify.add(hanbatUser1);
        chungnamNotify.add(hanbatUser1);
        hannamNotify.add(hanbatUser1);
        hanbatNotify.add(hanbatUser2);

        //충남대생 Noti등록
        hanbatNotify.add(chungnamUser1);
        chungnamNotify.add(chungnamUser1);
        hannamNotify.add(chungnamUser1);
        chungnamNotify.add(chungnamUser2);

        //한남대생 Noti등록
        hanbatNotify.add(hannamUser1);
        chungnamNotify.add(hannamUser1);
        hannamNotify.add(hannamUser1);
        hannamNotify.add(hannamUser2);

        ////////////////////////

        ///Temp Noti
        hanbatNotify.notifyObservers("임시경기",new Date(),"한밭대", "한밭대학교");
        //////////// TODO: Builder에서 노티 완료하면 삭제

        System.out.println();
        System.out.println();
        //////////////////Builder TODO:Build후 알아서 Noti하게

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
        System.out.println();
        System.out.println();
        ///Strategy Pattern

        //참가자 전원 등록
        game1.attend(hanbatUser1);
        game1.attend(hanbatUser2);
        game1.attend(hannamUser1);
        game1.attend(hannamUser2);
        game1.attend(chungnamUser1);
        game1.attend(chungnamUser2);
        

        //두가지 전략 생성
        RunGame KDK = new KDK_Run();
        RunGame Hanul = new Hanul_Run();

        System.out.println("KDK전략으로 출력");
        KDK.Run(game1.getGameParticipant());

        System.out.println("한울 전략으로 출력");
        Hanul.Run(game1.getGameParticipant());


        ////////////////////







    }
}